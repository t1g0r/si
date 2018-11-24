package com.tigorworks.mycontact.repository;

import com.tigorworks.mycontact.domain.Contact;

import java.util.ArrayList;

public interface ContactRepository {
    public ArrayList<Contact> GetAllContacts();
    public void Update(Contact contact);
    public int Insert(Contact contact);
    public void DeleteById(int id);
    public Contact GetContactById(int id);
}
