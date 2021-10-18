package com.myappcompany.hh.cashconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertCurrencty(View view){
        Log.i("Info", "Button pressed");
        EditText editText  = (EditText)findViewById(R.id.editText);
        String amountInDollar = editText.getText().toString();
        double amountInDollarDouble = Double.parseDouble(amountInDollar);
        double amountInRupees = amountInDollarDouble * 70;
        String amountInRupeesString = String.format("%.2f",amountInRupees);
        Log.i("Amount in dollars", amountInRupeesString);

        Toast.makeText(this, "$"+amountInDollar+" is Rs."+amountInRupeesString, Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
