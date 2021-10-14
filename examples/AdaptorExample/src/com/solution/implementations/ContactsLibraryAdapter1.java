package com.solution.implementations;

import com.company.Contact;
import com.company.ContactsGetterInterface;
import org.thirdparty.ContactsLibrary;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;


/** This solution uses inheritance adapter */
public class ContactsLibraryAdapter1 extends ContactsLibrary implements ContactsGetterInterface {

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
}
