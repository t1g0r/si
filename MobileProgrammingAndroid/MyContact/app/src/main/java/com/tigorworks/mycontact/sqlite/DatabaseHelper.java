package com.tigorworks.mycontact.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String databaseName = "sales.db";
    private String createTableQuery;
    private String dropTableQuery;

    public DatabaseHelper(Context context, String createTableQuery, String dropTableQuery){
        super(context,databaseName,null,1);
        this.createTableQuery   = createTableQuery;
        this.dropTableQuery     = dropTableQuery;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(this.createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(dropTableQuery);
        this.onCreate(db);
    }

    @Override
    public SQLiteDatabase getReadableDatabase() {
        return this.getReadableDatabase();
    }

    @Override
    public SQLiteDatabase getWritableDatabase() {
        return this.getWritableDatabase();
    }
}
