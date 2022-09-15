package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    static double lbpAmount = 0;

    public void lbpInput(View v){
        EditText extractingValue = findViewById(R.id.lbpAmount);
        String amount = extractingValue.getText().toString();
        lbpAmount = Double.parseDouble(amount);
        Toast.makeText(getApplicationContext(), amount, Toast.LENGTH_LONG).show();
    }

    public double convertLBPtoUSD(){
        double usdAmount = lbpAmount/40000;
        return usdAmount;
    }


}