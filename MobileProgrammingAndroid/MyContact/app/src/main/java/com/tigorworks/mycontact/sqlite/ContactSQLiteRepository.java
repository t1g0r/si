package com.tigorworks.mycontact.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.tigorworks.mycontact.domain.Contact;
import com.tigorworks.mycontact.repository.ContactRepository;

import java.util.ArrayList;

public class ContactSQLiteRepository implements ContactRepository {
    private DatabaseHelper db;
    private String table        = "Contacts";
    private String createTable  = "Create Table IF Not Exists " + table +
                                    " (id INTEGER PRIMARY KEY AUTOINCREAMENT, name VARCHAR(50), address VARCHAR(200))";
    private String selectAll    = "select * from " + table;
    private String dropTable    = "drop table IF EXISTS " + table;
    private String selectById   = "select * from " + table + " where id = %d";


    public ContactSQLiteRepository(Context context){
        db = new DatabaseHelper(context,createTable,dropTable);

    }


    @Override
    public ArrayList<Contact> GetAllContacts() {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        Cursor rs                   = db.getReadableDatabase().rawQuery(this.selectAll,null);
        rs.moveToFirst();

        while (!rs.isAfterLast()){
            Contact contact         = new Contact();
            contact.setId(rs.getInt(rs.getColumnIndex("id")));
            contact.setNama(rs.getString(rs.getColumnIndex("name")));
            contact.setAlamat(rs.getString(rs.getColumnIndex("address")));
            contacts.add(contact);

            rs.moveToNext();
        }

        if (!rs.isClosed()) {
            rs.close();
        }
        return contacts;
    }

    @Override
    public void Update(Contact contact) {
        ContentValues cv        = new ContentValues();
        cv.put("name",contact.getNama());
        cv.put("address",contact.getAlamat());


        db.getWritableDatabase().update(this.table,cv,"id = ?" ,new String[]{String.valueOf(contact.getId())});
    }

    @Override
    public int Insert(Contact contact) {
        ContentValues cv        = new ContentValues();
        cv.put("name",contact.getNama());
        cv.put("address",contact.getAlamat());


        return (int) db.getWritableDatabase().insert(this.table,null,cv);
    }

    @Override
    public void DeleteById(int id) {

        db.getWritableDatabase().delete(this.table,"id = ?" , new String[]{String.valueOf(id)});

    }

    @Override
    public Contact GetContactById(int id) {
        Contact contact = new Contact();
        Cursor rs                       = db.getReadableDatabase().rawQuery(String.format(this.selectById,id),null);
        rs.moveToFirst();

        if (!rs.isAfterLast()) {
            contact.setId(rs.getInt(rs.getColumnIndex("id")));
            contact.setNama(rs.getString(rs.getColumnIndex("name")));
            contact.setAlamat(rs.getString(rs.getColumnIndex("address")));
        }

        if (!rs.isClosed()) {
            rs.close();
        }

        return contact;
    }
}
