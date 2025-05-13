package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.Contact;
import FullStack.fullStackdemo.exception.EntityExceptionNotFound;
import FullStack.fullStackdemo.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    public ContactRepo contactRepo;
    @Override
    public Contact getContactById(int id) {
        return contactRepo.findById(id)
                .orElseThrow(() -> new EntityExceptionNotFound("Contact not found"));
    }
    @Override
    public Contact createContact(Contact contact) {
        return contactRepo.save(contact);
    }

    @Override
    public void deleteContact(int id) {
         contactRepo.deleteById(id);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }
}
