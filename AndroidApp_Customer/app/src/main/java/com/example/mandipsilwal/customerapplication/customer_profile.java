package com.example.mandipsilwal.customerapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.sagarmatha.customerApplication.bean.Customer;
import com.sagarmatha.customerApplication.utils.HttpUtils;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class customer_profile extends drawer {

    EditText input_firstName;
    EditText input_middleName;
    EditText input_lastName;
    EditText input_email;
    EditText input_phone;
    Spinner input_gender;
    String firstName, middleName, lastName, phone, email, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //inflate your activity layout here!
        View contentView = inflater.inflate(R.layout.activity_customer_profile, null, false);
        drawer.addView(contentView, 0);

        input_firstName = (EditText)findViewById(R.id.display_firstname);
        input_middleName = (EditText)findViewById(R.id.display_middleName);
        input_lastName = (EditText)findViewById(R.id.display_lastname);
        input_email = (EditText)findViewById(R.id.display_email);
        input_phone = (EditText)findViewById(R.id.display_cellNumber);
        input_gender = (Spinner)findViewById(R.id.gender);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.genders_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        input_gender.setAdapter(adapter);
        input_firstName.setText(Login.customerLogged.getCustFirstName());
        input_middleName.setText(Login.customerLogged.getCustMiddleName());
        input_lastName.setText(Login.customerLogged.getCustLastName());
        input_phone.setText(Login.customerLogged.getPhone());
        input_email.setText(Login.customerLogged.getEmail());
        gender = Login.customerLogged.getGender();

        if(gender.equals("Male")){
            input_gender.setSelection(0);
        }else if(gender.equals("Female")){
            input_gender.setSelection(1);
        }

        input_gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gender = String.valueOf(input_gender.getSelectedItem());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void onClickFirstName(View view){
        input_firstName.setCursorVisible(true);
        input_firstName.setEnabled(true);
        input_firstName.setFocusableInTouchMode(true);
    }

    public void onClickMiddleName(View view){
        input_middleName.setCursorVisible(true);
        input_middleName.setEnabled(true);
        input_middleName.setFocusableInTouchMode(true);
    }

    public void onClickLastName(View view){
        input_lastName.setCursorVisible(true);
        input_lastName.setEnabled(true);
        input_lastName.setFocusableInTouchMode(true);
    }

    public void onClickPhone(View view){
        input_phone.setCursorVisible(true);
        input_phone.setEnabled(true);
        input_phone.setFocusableInTouchMode(true);
    }

    public void onClickEmail(View view){
        input_email.setCursorVisible(true);
        input_email.setEnabled(true);
        input_email.setFocusableInTouchMode(true);
    }

    public void save(View view){
        firstName = input_firstName.getText().toString();
        lastName = input_lastName.getText().toString();
        middleName = input_middleName.getText().toString();
        phone = input_phone.getText().toString();
        email = input_email.getText().toString();

        RequestParams params = new RequestParams();     // instantiating an object 'params' of RequestParams Type
        params.put("customerId", Login.customerLogged.getCustomerId());
        params.put("userName",Login.customerLogged.getUserName() );
        params.put("password", Login.customerLogged.getPassword());
        params.put("custFirstName", firstName);
        params.put("custMiddleName", middleName);
        params.put("custLastName", lastName);
        params.put("email",email );
        params.put("phone", phone);
        params.put("gender", gender);
        params.setUseJsonStreamer(true);                // converts the param object to JSON object which will be sent as a request

        try {
            updateRestCall(params);                      // calls the method loginRestCall(params) to invoke the rest web service
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that performs restful web service invocations
     * Once the response is received from the backend
     * on success - registers the user to the system and redirects the user to login page
     * on Failure - notifies the user to enter the valid user credentials
     *
     * @throws JSONException
     *
     * no return
     */
    public void updateRestCall(RequestParams params) throws JSONException {

        String url = "update/updateUser";

        // calls post method in HttpUtils class with rest url, RequestParam and JsonHttpResponseHandler object as paramter.
        // sends the request to backend and receives the response in Json Format form the backend
        HttpUtils.post(url, params, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                // Root JSON in response is an dictionary i.e { "data : [ ... ] }
                // Handle resulting parsed JSON response here
                try {                           // gets the information of the user after successful login
                    if(response.getString("custFirstName") == "null"){
                        Toast.makeText(getApplicationContext(),"Record cannot be updated with the input value", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getApplicationContext(),"Record has been updated..", Toast.LENGTH_SHORT).show();
                        Login.customerLogged = new Gson().fromJson(response.toString(),Customer.class);
                        setDisplayName(Login.customerLogged.getCustFirstName()+" "+Login.customerLogged.getCustMiddleName()+" "+Login.customerLogged.getCustLastName());
                       // startActivity(new Intent(getApplicationContext(), customer_profile.class));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String res, Throwable t) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
                System.out.println("failed here ....."+ res);
            }
        });
    }
}
