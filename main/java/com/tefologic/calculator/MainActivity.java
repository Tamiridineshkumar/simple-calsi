package com.tefologic.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int result = n1+n2;

        editText3.setText("Add Value " + result);
    }
    public void Subtract(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int result = n1-n2;

        editText3.setText("Subtract Value " + result);
    }
    public void Multiply(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int result = n1*n2;

        editText3.setText("Multiply Value " + result);
    }
    public void Division(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);

        double n1 = Integer.parseInt(editText1.getText().toString());
        double n2 = Integer.parseInt(editText2.getText().toString());
        double result = n1/n2;

        editText3.setText("Division Value " + result);
    }

}