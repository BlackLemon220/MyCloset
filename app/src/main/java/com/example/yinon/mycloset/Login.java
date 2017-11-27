package com.example.yinon.mycloset;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.username).setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                EditText username = (EditText)v;
                if (hasFocus) {
                    if(username.getText().toString().equals("Username")) username.setText("");
                } else { // no focus
                    if(username.getText().toString().equals("")) username.setText("Username");
                }
            }
        });

        findViewById(R.id.password).setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                EditText username = (EditText)v;
                if (hasFocus) {
                    if(username.getText().toString().equals("Password")) username.setText("");
                } else { // no focus
                    if(username.getText().toString().equals("")) username.setText("Password");
                }
            }
        });
    }

    public void openRegistration(View view) {
        Intent intent = new Intent(Login.this, Registration.class);
        startActivity(intent);
    }

    public void openReadMe(View view) {
        Intent intent = new Intent(Login.this, README.class);
        startActivity(intent);
    }
}
