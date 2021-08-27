package com.softhub.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

import static com.softhub.exam.R.id.et_mobile_no;

public class exam2 extends AppCompatActivity {

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
        mobile_no = findViewById(et_mobile_no);
        pw = findViewById(R.id.et_pw);
        confirm_pw = findViewById(R.id.et_confirm_pw);
        submit = findViewById(R.id.btn_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JSONObject USERDetails = new JSONObject();
                JSONObject USERList = new JSONObject();
                if (first_name.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this,"first name should not be empty",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (middle_name.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this, "middle name should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (last_name.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this, "last name should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (DD.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this, "DD should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (MM.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this, "MM should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (YYYY.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this, "YYYY should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (DD.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this, "DD should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (mobile_no.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this, "mobile no should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (pw.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this, "pw should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (confirm_pw.getText().toString().isEmpty()){
                    Toast.makeText(exam2.this, "confirm pw should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (pw.getText().toString().equals(confirm_pw.getText().toString().isEmpty())){
                    Toast.makeText(exam2.this, "pw matched", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(exam2.this, "pw mismatched", Toast.LENGTH_SHORT).show();
                }
            }
        });








    }
}