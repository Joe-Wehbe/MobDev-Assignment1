package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v){
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        String username_val = username.getText().toString();
        String password_val = password.getText().toString();

        if(username_val.equals("user.leb") && password_val.equals("123456")){
            Toast.makeText(getApplicationContext(), "Log in successful", Toast.LENGTH_LONG).show();
            Intent i = new Intent(getApplicationContext(), LandingActivity.class);
            startActivity(i);
        } if(username_val.equals("") || password_val.equals("")){
            Toast.makeText(getApplicationContext(), "Missing credentials", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "Incorrect username or password", Toast.LENGTH_LONG).show();

        }

    }
}


