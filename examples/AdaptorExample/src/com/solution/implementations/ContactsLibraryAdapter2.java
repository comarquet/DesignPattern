package com.solution.implementations;

import com.company.Contact;
import org.thirdpartyB.ContactsGetterInterface;
import org.thirdpartyA.ContactsLibrary;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;


/** This solution uses composition adapter */
public class ContactsLibraryAdapter2 implements ContactsGetterInterface {
    private ContactsLibrary contactsLibrary;

    public ContactsLibraryAdapter2(ContactsLibrary contactsLibrary) {
        this.contactsLibrary = contactsLibrary;
    }

    public AbstractList<Contact> getContacts() {
        ArrayList<Contact> results = new ArrayList<Contact>();
        LinkedHashMap<String, String> contacts = this.contactsLibrary.fetchContacts();

        Iterator<String> iterator = contacts.keySet().iterator();
        while(iterator.hasNext()) {
            String contactName = iterator.next();
            String contactPhone = contacts.get(contactName);
            Contact myContact = new Contact(contactName, contactPhone);
            results.add(myContact);
        }
        return results;
    }
}
