package com.example.gridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, plus, sub, mul, div, equal, ac,dot;
    float value1, value2;
    boolean Addition, Subtraction, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.ed);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button4);
        b3 = findViewById(R.id.button5);
        b4 = findViewById(R.id.button6);
        b5 = findViewById(R.id.button7);
        b6 = findViewById(R.id.button8);
        b7 = findViewById(R.id.button9);
        b8 = findViewById(R.id.button10);
        b9 = findViewById(R.id.button11);
        b0 = findViewById(R.id.button13);
        plus = findViewById(R.id.button12);
        sub = findViewById(R.id.button14);
        mul = findViewById(R.id.button15);
        div = findViewById(R.id.button16);
        equal = findViewById(R.id.button17);
        dot = findViewById(R.id.button18);
        ac = findViewById(R.id.button19);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + ".");

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    Addition = true;
                    editText.setText(null);

                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(editText.getText() + "");
                Subtraction = true;
                editText.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(editText.getText() + "");
                Multiplication = true;
                editText.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(editText.getText() + "");
                Division = true;
                editText.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Float.parseFloat(editText.getText() + "");
                if (Addition == true) {
                    editText.setText(value1 + value2 + "");
                    Addition = false;
                }
                if (Subtraction == true) {
                    editText.setText(value1 - value2 + "");
                    Subtraction = false;
                }
                if (Multiplication == true) {

                    editText.setText(value1 * value2 + "");
                    Multiplication = false;
                }
                if (Division == true) {
                    editText.setText(value1 / value2 + "");
                    Division = false;
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });
    }
}
