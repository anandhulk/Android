package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name,pass,res;
        Button sub,reset;

        name=(EditText)findViewById(R.id.namein);
        pass=(EditText)findViewById(R.id.passin);
        res=(EditText)findViewById(R.id.result);

        sub=(Button)findViewById(R.id.submit);
        reset=(Button)findViewById(R.id.reset);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=name.getText().toString();
                res.setText("welcome "+n);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                pass.setText("");
                res.setText("");
            }
        });
    }
}
