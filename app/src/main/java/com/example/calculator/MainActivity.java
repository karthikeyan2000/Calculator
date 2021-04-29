package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    float mValueOne, mValueTwo;
    boolean dot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void onClick0(View view) {
        editText.setText(String.format("%s0", editText.getText()));
    }

    public void onClick1(View view) {
        editText.setText(String.format("%s1", editText.getText()));
    }

    public void onClick2(View view) {
        editText.setText(String.format("%s2", editText.getText()));
    }

    public void onClick3(View view) {
        editText.setText(String.format("%s3", editText.getText()));
    }

    public void onClick4(View view) {
        editText.setText(String.format("%s4", editText.getText()));
    }

    public void onClick5(View view) {
        editText.setText(String.format("%s5", editText.getText()));
    }

    public void onClick6(View view) {
        editText.setText(String.format("%s6", editText.getText()));
    }

    public void onClick7(View view) {
        editText.setText(String.format("%s7", editText.getText()));
    }

    public void onClick8(View view) {
        editText.setText(String.format("%s8", editText.getText()));
    }

    public void onClick9(View view) {
        editText.setText(String.format("%s9", editText.getText()));
    }

    public void onClickDot(View view) {
        if(dot) {
            editText.setText(String.format("%s.", editText.getText()));
            dot = true;
        }
    }

    public void onClickClear(View view) {
        editText.setText("");
        mValueOne = 0;
        mValueTwo = 0;
    }

    public void onClickNext(View view) {
        mValueOne = Float.parseFloat(editText.getText() + "");
        editText.setText(null);
    }

    public void onClickMin(View view) {
        mValueTwo = Float.parseFloat(editText.getText() + "");
        editText.setText((mValueOne > mValueTwo) ? mValueTwo + "" : mValueOne + "");
    }

    public void onClickMax(View view) {
        mValueTwo = Float.parseFloat(editText.getText() + "");
        editText.setText((mValueOne > mValueTwo) ? mValueOne + "" : mValueTwo + "");
    }

    public void onClickAverage(View view) {
        mValueTwo = Float.parseFloat(editText.getText() + "");
        editText.setText(String.format("%s", (mValueTwo + mValueOne) / 2));
    }
}