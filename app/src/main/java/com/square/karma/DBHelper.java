package com.square.karma;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrateur on 03/07/13.
 */
public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="karma";
    private static final SQLiteDatabase.CursorFactory FACTORY = null;
    private static final int  VERSION =2;

    SQLiteDatabase db;

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public DBHelper(Context context){
        super(context,DB_NAME,FACTORY,VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        try
        {

            String query = "CREATE TABLE karma (karma VARCHAR(255));";
            //Log.e("vv", ""+query);
            db.execSQL(query);


        }
        catch(Exception e){}

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i2) {
        db.execSQL("DROP TABLE IF EXISTS "+DB_NAME);
        onCreate(db);
    }

    public void update(String score){
       String[] params = {score};
       db=  this.getWritableDatabase();
        Log.e("vv", "update " + score);
       db.update("karma", mapKarma2Db(score),null,null);

    }
    public String getKarma(){
        db=this.getReadableDatabase();
        Log.e("vv","Getting it all");
        String[] columns={"karma"};  //String[] params = {""};

        Cursor c = db.query("karma",columns,null,null,null,null,null);
       // Log.e("vv",c.getCount()+" rows");
        c.moveToFirst();
        try {
            String result = c.getString(0);
            c.close();
            return result;
        }catch(Exception e){
            String query = "INSERT INTO karma VALUES('0');";
            //Log.e("vv", ""+query);

            db.execSQL(query);
            return 0+"";
        }
    }

    public SQLiteDatabase open() {
        db=this.getWritableDatabase();
        return db;
    }

    public void close(){
        db.close();
    }

    private ContentValues mapKarma2Db (String score){
        ContentValues contV = new ContentValues();
        contV.put("karma",score);
        return contV;
    }




}
