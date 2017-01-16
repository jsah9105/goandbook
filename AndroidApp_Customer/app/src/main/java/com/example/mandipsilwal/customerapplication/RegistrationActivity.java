package com.example.mandipsilwal.customerapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.sagarmatha.customerApplication.utils.HttpUtils;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class RegistrationActivity extends AppCompatActivity {

    private static EditText userNameRegister;
    private static EditText passwordRegister;
    private static EditText emailRegister;
    private static EditText phoneRegister;
    private static EditText firstName;
    private static EditText lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button signUpButton = (Button) findViewById(R.id.create_account);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });


    }

    public void registerUser() {
        // Gets the username and password typed by the user in the andorid app and sets it to EditText variables
        userNameRegister = (EditText) findViewById(R.id.userNameRegister);
        passwordRegister = (EditText) findViewById(R.id.passwordRegister);
        emailRegister = (EditText) findViewById(R.id.emailRegister);
        phoneRegister = (EditText) findViewById(R.id.phoneRegister);
        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);


        // converts the username and password from EditText to String and stores it to string variables
        String userName = userNameRegister.getText().toString();
        String password = passwordRegister.getText().toString();
        String custFirstName = firstName.getText().toString();
        String custLastName =lastName.getText().toString();
        String email = emailRegister.getText().toString();
        String phone = phoneRegister.getText().toString();

        RequestParams params = new RequestParams();     // instantiating an object 'params' of RequestParams Type
        params.put("userName",userName );
        params.put("password", password);
        params.put("custFirstName", custFirstName);
        params.put("custLastName", custLastName);
        params.put("email",email );
        params.put("phone", phone);
        params.setUseJsonStreamer(true);                // converts the param object to JSON object which will be sent as a request

        try {
            registerRestCall(params);                      // calls the method loginRestCall(params) to invoke the rest web service
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void registerRestCall(RequestParams params) throws JSONException {

        String url = "registration/customerRegistration";

        // calls post method in HttpUtils class with rest url, RequestParam and JsonHttpResponseHandler object as paramter.
        // sends the request to backend and receives the response in Json Format form the backend
        HttpUtils.post(url, params, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                // Root JSON in response is an dictionary i.e { "data : [ ... ] }
                // Handle resulting parsed JSON response here
                try {                           // gets the information of the user after successful login
                    if (response.getString("message").equals("Success")) {
                        startActivity(new Intent(getApplicationContext(), Login.class));

                    } else {
                        //ObjectMapper mapper = new ObjectMapper();

                        //  customerLogged = new Gson().fromJson(response.toString(),Customer.class);
                        String errorMsg = response.getString("message");
                        TextView errorView = (TextView) findViewById(R.id.error);
                        errorView.setText(errorMsg);
//                        Toast.makeText(getApplicationContext(),errorMsg, Toast.LENGTH_SHORT).show();

                        //String name = response.getString("custFirstName")+" " +response.getString("custLastName");
                        //  String name = customerLogged.getCustFirstName() + " " + customerLogged.getCustLastName();
                        // displayName = name;
//                        Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
//                        startActivity(intent);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String res, Throwable t) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
                 System.out.println("failed here .....");
            }
        });
    }
}



