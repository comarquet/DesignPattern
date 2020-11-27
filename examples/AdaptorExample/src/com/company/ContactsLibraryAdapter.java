package com.company;

import org.thirdparty.ContactsLibrary;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ContactsLibraryAdapter extends ContactsLibrary implements ContactsGetterInterface {

    public AbstractList<Contact> getContacts() {
        ArrayList<Contact> results = new ArrayList<Contact>();
        LinkedHashMap<String, String> contacts = this.fetchContacts();

        Iterator<String> iterator = contacts.keySet().iterator();
        while(iterator.hasNext()) {
            String contactName = iterator.next();
            String contactPhone = contacts.get(contactName);
            Contact myContact = new Contact(contactName, contactPhone);
            results.add(myContact);
        }
        return results;
    }

//    private ContactsLibrary contactsLibrary;
//
//    public ContactsLibraryAdapter(ContactsLibrary contactsLibrary) {
//        this.contactsLibrary = contactsLibrary;
//    }

//    public AbstractList<Contact> getContacts() {
//
//        ArrayList<Contact> results = new ArrayList<Contact>();
//        LinkedHashMap<String, String> contacts = this.contactsLibrary.fetchContacts();
//        Iterator<String> iterator = contacts.keySet().iterator();
//        while(iterator.hasNext()) {
//            String contactName = iterator.next();
//            String contactPhone = contacts.get(contactName);
//            Contact myContact = new Contact(contactName, contactPhone);
//            results.add(myContact);
//        }
//        return results;
//
//    }
}
