package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class DBMS_Class extends SQLiteOpenHelper {

    public static final String DB_name = "Login_Db";
    private static final int DB_VERSION = 1;

    private static final String tbl_nm = "User";

    private static final String id = "id";
    private static final String email = "email";
    private static final String pwd = "password";

    public DBMS_Class(Context context){
        super(context, DB_name, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + tbl_nm + " ("
                + id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + email + " TEXT,"
                + pwd + " TEXT)";

        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + tbl_nm);
        onCreate(sqLiteDatabase);
    }

    public void save_login(String em,String passwd){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(email, em);
        values.put(pwd, passwd);

        db.insert(tbl_nm, null, values);
        db.close();
    }

}
