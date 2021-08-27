package com.softhub.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;



public class MainActivity extends AppCompatActivity {

    EditText first_name;
    EditText middle_name;
    EditText last_name;
    EditText DD;
    EditText MM;
    EditText YYYY;
    EditText mobile_no;
    EditText pw;
    EditText confirm_pw;
    Button submit;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_name = findViewById(R.id.et_first_name);
        middle_name = findViewById(R.id.et_middle_name);
        last_name = findViewById(R.id.et_last_name);
        DD = findViewById(R.id.et_DD);
        MM = findViewById(R.id.et_MM);
        YYYY = findViewById(R.id.et_YYYY);
        mobile_no = findViewById(R.id.et_mobile_no);
        pw = findViewById(R.id.et_pw);
        confirm_pw = findViewById(R.id.et_confirm_pw);
        submit = findViewById(R.id.btn_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JSONObject userDetails = new JSONObject();
                JSONObject userList  = new JSONObject();
                if (first_name.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"first name should not be empty",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (middle_name.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "middle name should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (last_name.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "last name should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (DD.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "DD should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (MM.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "MM should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (YYYY.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "YYYY should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (mobile_no.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "mobile no should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (pw.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "pw should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (confirm_pw.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "confirm pw should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (pw.getText().toString().equals(confirm_pw.getText().toString())){
                    Toast.makeText(MainActivity.this, "pw matched", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "pw mismatched", Toast.LENGTH_SHORT).show();
                }
                try {
                    userDetails.put("first_name", first_name.getText().toString());
                    userDetails.put("middle_name", middle_name.getText().toString());
                    userDetails.put("last_name", last_name.getText().toString());
                    userDetails.put("dob", DD.getText().toString() + "/" + MM.getText().toString() + "/" + YYYY.getText().toString());
                    userList.put(pw.getText().toString(),userDetails);
                    Log.e("TAG", "onClick: "+userList );

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

        });








    }
}