package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.Contact;

import java.util.List;

public interface ContactService {
    public Contact getContactById(int id);
    public Contact createContact(Contact contact);
    public void deleteContact(int id);
    public List<Contact> getAllContacts();
}
