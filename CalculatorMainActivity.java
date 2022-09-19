package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    float sol=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.et1);
        number2=findViewById(R.id.et2);
        b1=findViewById(R.id.b11);
        b2=findViewById(R.id.b12);
        b3=findViewById(R.id.b13);
        b4=findViewById(R.id.b14);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a+b;
                Toast.makeText(MainActivity.this, "Sum="+sol, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a-b;
                Toast.makeText(MainActivity.this, "Difference="+sol, Toast.LENGTH_SHORT).show();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a*b;
                Toast.makeText(MainActivity.this, "Product="+sol, Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a/b;
                Toast.makeText(MainActivity.this, "Quotient="+sol, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
