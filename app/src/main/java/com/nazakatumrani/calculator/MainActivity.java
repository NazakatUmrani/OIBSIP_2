package com.nazakatumrani.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPoint, buttonDivide, buttonMultiply, buttonPlus, buttonMinus, buttonEqual, buttonDel, buttonC, buttonPAndM;
    public EditText inputField;
    public TextView resultField;
    public char operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonDel = findViewById(R.id.buttonDel);
        buttonC = findViewById(R.id.buttonC);
        buttonPAndM = findViewById(R.id.buttonPAndM);
        inputField = findViewById(R.id.inputField);
        resultField = findViewById(R.id.resultTextView);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("9");
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!hasChar(inputField.getText().toString(),'.'))
                    inputField.append(".");
            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputField.getText().toString().length()>0)
                    inputField.setText(inputField.getText().subSequence(0,inputField.getText().toString().length() - 1));
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultField.setText("");
                inputField.setText("");
            }
        });
        buttonPAndM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputField.getText().toString().length()>0)
                    if(Double.parseDouble(inputField.getText().toString())>=0)
                        inputField.setText(String.format("-%s", inputField.getText()));
                    else
                        inputField.setText(inputField.getText().toString().substring(1));
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((inputField.getText().toString().length()>0))
                    resultField.setText(inputField.getText().toString());
                inputField.setText("");
                operation = '/';
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((inputField.getText().toString().length()>0))
                    resultField.setText(inputField.getText().toString());
                inputField.setText("");
                operation = '*';
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((inputField.getText().toString().length()>0))
                    resultField.setText(inputField.getText().toString());
                inputField.setText("");
                operation = '+';
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((inputField.getText().toString().length()>0))
                    resultField.setText(inputField.getText().toString());
                inputField.setText("");
                operation = '-';
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation=='/'){
                    resultField.setText(String.format("%s", Double.parseDouble(resultField.getText().toString()) / Double.parseDouble(inputField.getText().toString())));
                }
                else if(operation=='*'){
                    resultField.setText(String.format("%s", Double.parseDouble(resultField.getText().toString())*Double.parseDouble(inputField.getText().toString())));
                }
                else if(operation=='+'){
                    resultField.setText(String.format("%s", Double.parseDouble(resultField.getText().toString())+Double.parseDouble(inputField.getText().toString())));
                }
                else if(operation=='-'){
                    resultField.setText(String.format("%s", Double.parseDouble(resultField.getText().toString())-Double.parseDouble(inputField.getText().toString())));
                }
                inputField.setText("");
            }
        });
    }
    public boolean hasChar(String s, char c){
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
}