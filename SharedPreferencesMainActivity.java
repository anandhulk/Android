package com.example.sharedpreferencesactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    EditText name,age,phoneno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.ee1);
        age=(EditText) findViewById(R.id.ee2);
        phoneno=(EditText)findViewById(R.id.ee3);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sh = getSharedPreferences("sp",MODE_PRIVATE);
        String n=sh.getString("name","");
        int a=sh.getInt("age",0);
        int phone=sh.getInt("phoneno",0);


    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("sp",MODE_PRIVATE);
        SharedPreferences.Editor sp = sharedPreferences.edit();
        sp.putString("name",name.getText().toString());
        sp.putInt("age",Integer.parseInt(age.getText().toString()));
        sp.putInt("phoneno",Integer.parseInt(phoneno.getText().toString()));
        sp.commit();
        sp.apply();
    }
}
