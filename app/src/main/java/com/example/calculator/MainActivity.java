package com.example.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonDot, buttonDivide, buttonEqual, buttonMultiply, buttonSubtract, buttonAdd, buttonClear;
    EditText editText;

    float Val1, Val2;
    boolean valAdd, valSub, valMul, valDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        editText = (EditText) findViewById(R.id.editText);

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val1 = Float.parseFloat(editText.getText() + "");

                valDiv = true;
                editText.setText(null);
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val1 = Float.parseFloat(editText.getText() + "");

                valMul = true;
                editText.setText(null);
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val1 = Float.parseFloat(editText.getText() + "");

                valAdd = true;
                editText.setText(null);
            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val1 = Float.parseFloat(editText.getText() + "");

                valSub = true;
                editText.setText(null);
            }
        });
        buttonEqual.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Val1 = Float.parseFloat(editText.getText() + "");

                if (valSub == true){
                    float calVal = Val1 - Val2;
                    editText.setText(Float.toString(calVal));
                }
                if (valDiv == true){
                    float calVal = Val1 + Val2;
                    editText.setText(Float.toString(calVal));
                }
                if (valMul == true){
                    float calVal = Val1 * Val2;
                    editText.setText(Float.toString(calVal));
                }
                if (valAdd == true){
                    editText.setText(Val1 + Val2 + "");
                }
            }
        }));
        buttonClear.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    editText.setText("");
            }
        }));
    }
}