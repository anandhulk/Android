package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    EditText first;
    EditText last,num;
    public static final String SHARED="sharedprefs";
    public static final String NAME="nm";
    public static final String LAST="ls";
    public static final String DIG="digit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first=findViewById(R.id.first);
        last=findViewById(R.id.last);
        num=findViewById(R.id.number);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "ON...pause..", Toast.LENGTH_SHORT).show();
        SharedPreferences sh = getSharedPreferences(SHARED,MODE_PRIVATE);
        SharedPreferences.Editor edit=sh.edit();
        edit.putString(NAME,first.getText().toString());
        edit.putString(LAST,last.getText().toString());
        edit.putInt(DIG,Integer.parseInt(num.getText().toString()));
        //sp.commit();
        edit.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "ON...resume", Toast.LENGTH_SHORT).show();
        SharedPreferences sh=getSharedPreferences(SHARED,MODE_PRIVATE);
        String str=sh.getString(NAME,"");
        String str1=sh.getString(LAST,"");
        int a=sh.getInt(DIG,0);

        first.setText(str);
        last.setText(str1);
        num.setText(String.valueOf(a));
    }
}
