package com.myappcompany.hh.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginDemo extends AppCompatActivity {

    public void logInButton(View view){
        Log.i("Info","Button pressed");
//        EditText logInId = (EditText);
        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        Log.i("Username",usernameEditText.getText().toString());
        Log.i("password",passwordEditText.getText().toString());
        Toast.makeText(this,"Hi there", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_demo);
    }
}
