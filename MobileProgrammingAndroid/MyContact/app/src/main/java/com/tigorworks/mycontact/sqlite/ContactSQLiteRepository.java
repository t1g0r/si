package com.tigorworks.mycontact.sqlite;

import com.tigorworks.mycontact.domain.Contact;
import com.tigorworks.mycontact.repository.ContactRepository;

import java.util.ArrayList;

public class ContactSQLiteRepository implements ContactRepository {
    @Override
    public ArrayList<Contact> GetAllContacts() {
        return null;
    }

    @Override
    public void Update(Contact contact) {

    }

    @Override
    public int Insert(Contact contact) {
        return 0;
    }

    @Override
    public void DeleteById(int id) {

    }

    @Override
    public Contact GetContactById(int id) {
        return null;
    }
}
