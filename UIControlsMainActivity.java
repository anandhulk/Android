package com.example.uicontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText name,age,pass,phoneno;
    Button b;
    Pattern USERNAME_PATTERN=Pattern.compile("^[A-Za-z]\\w{5,30}$");
    Pattern PASSWORD_PATTERN =Pattern.compile("^" +"(?=.*[@#$%^&+=])" +"(?=\\S+$)" + ".{4,}" + "$");
    Pattern AGE_PATTERN= Pattern.compile("^" + "(?=\\S+$)" + "[0-9]{1,2}" + "$");
    Pattern PHONE_PATTERN=Pattern.compile("^(0|91)?[7-9][0-9]{9}$");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.ett1);
        age=findViewById(R.id.eet2);
        phoneno=findViewById(R.id.ett3);
        pass=findViewById(R.id.ett4);
        b=findViewById(R.id.bb1);
        
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=name.getText().toString();
                String a=age.getText().toString();
                String p=phoneno.getText().toString();
                String pa=pass.getText().toString();
                
                if(n.isEmpty()){
                    Toast.makeText(MainActivity.this, "Name field is empty", Toast.LENGTH_SHORT).show();
                }
                if(a.isEmpty()){
                    Toast.makeText(MainActivity.this, "Age field is Empty", Toast.LENGTH_SHORT).show();
                }
                if(p.isEmpty()){
                    Toast.makeText(MainActivity.this, "Phone field is Empty", Toast.LENGTH_SHORT).show();
                }
                if(pa.isEmpty()){
                    Toast.makeText(MainActivity.this, "Pass field is Empty", Toast.LENGTH_SHORT).show();
                }
                if (!USERNAME_PATTERN.matcher(n).matches()){
                    name.setError("Enter alphabets [6-30 characters]");
                }
                if (!AGE_PATTERN.matcher(a).matches()) {
                    age.setError("Incorrect Age");
                }
                if (!PHONE_PATTERN.matcher(p).matches()){
                    phoneno.setError("Contains only 10 digits");
                }
                if (!PASSWORD_PATTERN.matcher(pa).matches()){
                    pass.setError("Password is too weak");
                }
                else{
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
    }
}
