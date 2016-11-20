package com.example.allanralph.hostelapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ALLAN RALPH on 25-Sep-16.
 */
public class dbHandler extends SQLiteOpenHelper {

    public dbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //    public dbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//    }
//
    @Override
    public void onCreate(SQLiteDatabase sqdb0) {

        sqdb0.execSQL("create table northNVg (dayid integer primary key,day text,morn text,noon text,night text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqdb, int i, int i1) {
        sqdb.execSQL("drop table if exists northNVg");
        onCreate(sqdb);

    }

    void addData(int a, String b, String c, String d, String e) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues val = new ContentValues();
        val.put("dayid", a);
        val.put("day", b);
        val.put("morn", c);
        val.put("noon", d);
        val.put("night", e);

        db.insert("northNVg", null, val);

        db.close();

    }


    String getData(int gotsum) {

        int gt=gotsum;
        //String gotdayid=Integer.toString(gt);

        SQLiteDatabase db = this.getReadableDatabase();
      // Cursor cu = db.rawQuery("select * from northNVg",null);
        Cursor cu = db.rawQuery("select * from northNVg where dayid=?",new String[]{gt+""});

        String result = "";
            if(cu.moveToFirst()) {
                do {
                    String id = cu.getString(0);
                    String dy = cu.getString(1);
                    String br = cu.getString(2);
                    String lu = cu.getString(3);
                    String di = cu.getString(4);

                    result = dy + "\n" + br + "\n" + lu + "\n" + di;
                }
                while (cu.moveToNext());
            }
        return result;
    }

    }
