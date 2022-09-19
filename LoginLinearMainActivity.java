package com.example.loginlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText e1,e2;
    Button b1,b2;
    TextView t;

    String user="Admin";
    String pass="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.unm);
        e2=(EditText)findViewById(R.id.pwd);

        t=(TextView)findViewById(R.id.textView3);

        b1=(Button) findViewById(R.id.sbt);
        b2=(Button) findViewById(R.id.rst);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")){
                    String unm = e1.getText().toString();
                    String pd = e2.getText().toString();

                    t.setText("Username is: " + unm + " and Password is: " + pd);

                    if (unm.equals(user) && pass.equals(pd)) {
                        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();Toast.makeText(getApplicationContext(), "Valid User", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid user, Check....", Toast.LENGTH_LONG).show();
                    }

                }
                else {
                    Toast.makeText(getApplicationContext(), "Empty, Fill the fields", Toast.LENGTH_SHORT).show();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!e1.getText().toString().equals("")||!e2.getText().toString().equals("")){

                    e1.setText("");
                    e2.setText("");

                }
                else {
                    Toast.makeText(getApplicationContext(), "fields are already Empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
