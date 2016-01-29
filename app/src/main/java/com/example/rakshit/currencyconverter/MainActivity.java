package com.example.rakshit.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton;
    RadioButton radioButton2;
    EditText editText2;
    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
    }


    public void onRadioButtonClick(View view){
        if(radioButton.isChecked()){
            convertDollarToRupees();
        }


        if(radioButton2.isChecked()){
            convertRupeesToDollar();
        }
    }
    protected void convertDollarToRupees(){
        Double dd = Double.parseDouble(editText2.getText().toString());
        editText3.setText(dd.toString(dd*60));
    }
    protected void convertRupeesToDollar(){
        Double dd = Double.parseDouble(editText3.getText().toString());
        editText2.setText(dd.toString(dd*0.015));
    }
}
