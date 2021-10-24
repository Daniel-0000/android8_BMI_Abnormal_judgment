package com.example.android8_bmi_abnormal_judgment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
        EditText feildheight = findViewById(R.id.height);
        EditText feildweigth = findViewById(R.id.weight);

        float Height = Float.parseFloat(feildheight.getText().toString())/100;
        float Weight = Float.parseFloat(feildweigth.getText().toString());
        float BMI = Weight / (Height*Height);

        Intent intent = new Intent(this, ResultAcitvity.class);
        intent.putExtra("ATOB",BMI);
        startActivity(intent);


    }

}