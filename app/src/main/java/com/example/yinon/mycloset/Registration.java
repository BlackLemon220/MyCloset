package com.example.yinon.mycloset;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        findViewById(R.id.registerUsername).setOnFocusChangeListener(new View.OnFocusChangeListener() {
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

        findViewById(R.id.firstPassword).setOnFocusChangeListener(new View.OnFocusChangeListener() {
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

        findViewById(R.id.repassword).setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                EditText username = (EditText)v;
                if (hasFocus) {
                    if(username.getText().toString().equals("Re - Password")) username.setText("");
                } else { // no focus
                    if(username.getText().toString().equals("")) username.setText("Re - Password");
                }
            }
        });

        findViewById(R.id.email).setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                EditText username = (EditText)v;
                if (hasFocus) {
                    if(username.getText().toString().equals("Email")) username.setText("");
                } else { // no focus
                    if(username.getText().toString().equals("")) username.setText("Email");
                }
            }
        });
    }

    public void register(View view) {
        EditText username = (EditText)findViewById(R.id.registerUsername);
        EditText password = (EditText)findViewById(R.id.firstPassword);
        EditText repassword = (EditText)findViewById(R.id.repassword);
        EditText email = (EditText)findViewById(R.id.email);

        clearAllHints(username, password, repassword, email);
        int userLength = username.getText().toString().length();
        if(userLength > 12 || userLength < 6){
            Toast.makeText(Registration.this, "Invalid username length", Toast.LENGTH_LONG);
        }

    }

    private void clearAllHints(EditText username, EditText password, EditText repassword, EditText email) {
        username.setHint("");
        password.setHint("");
        repassword.setHint("");
        email.setHint("");
    }
}
