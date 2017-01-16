package com.example.mandipsilwal.customerapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.sagarmatha.customerApplication.bean.Customer;
import com.sagarmatha.customerApplication.utils.HttpUtils;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

//import com.ning.http.client.AsyncHttpClient;

public class Login extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    public static String displayName;
    public static Customer customerLogged;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView skip = (TextView) findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        Button signButton = (Button) findViewById(R.id.signUp);
        signButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RegistrationActivity.class));
            }
        });

        Button loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getuser();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * Method gets triggered when login button is clicked.
     * This method gets the username and password typed by the user and validates it
     * before calling the method to perform the rest web service call
     *
     * no return
     */
    public void getuser() {
        // Gets the username and password typed by the user in the andorid app and sets it to EditText variables
        username = (EditText) findViewById(R.id.userNameRegister);
        password = (EditText) findViewById(R.id.passwordRegister);

        // converts the username and password from EditText to String and stores it to string variables
        String user = username.getText().toString();
        String pass = password.getText().toString();

        RequestParams params = new RequestParams();     // instantiating an object 'params' of RequestParams Type
        params.put("userName", user);
        params.put("password", pass);
        params.setUseJsonStreamer(true);                // converts the param object to JSON object which will be sent as a request

        try {
            loginRestCall(params);                      // calls the method loginRestCall(params) to invoke the rest web service
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that performs restfull web service invocations
     * Once the response is recieved from the backend
     * on success - allows the user to perform the features that requires user login
     * on Failure - notifies the user to enter the valid user credentials
     *
     * @throws JSONException
     *
     * no return
     */
    public void loginRestCall(RequestParams params) throws JSONException {

        String url = "login/loginUser";

        // calls post method in HttpUtils class with rest url, RequestParam and JsonHttpResponseHandler object as paramter.
        // sends the request to backend and receives the response in Json Format form the backend
        HttpUtils.post(url, params, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                // Root JSON in response is an dictionary i.e { "data : [ ... ] }
                // Handle resulting parsed JSON response here
                try {                           // gets the information of the user after successful login
                    if(response.getString("custFirstName") == "null"){
                        startActivity(new Intent(getApplicationContext(), Login.class));

                    }else {
                        //ObjectMapper mapper = new ObjectMapper();

                        customerLogged = new Gson().fromJson(response.toString(),Customer.class);
                        int userID = response.getInt("customerId");
                        System.out.println("The user id: " + userID);

                        //String name = response.getString("custFirstName")+" " +response.getString("custLastName");
                        String name = customerLogged.getCustFirstName() + " " + customerLogged.getCustLastName();
                        displayName = name;
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String res, Throwable t) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
                System.out.println("failed Login");
            }
        });
    }


}
