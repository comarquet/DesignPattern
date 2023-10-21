package com.company;


import org.thirdpartyA.ContactsLibrary;
import org.thirdpartyB.ContactsGetterInterface;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ContactsLibraryAdapterWithInheritance extends ContactsLibrary implements ContactsGetterInterface {

    @Override
    public AbstractList<Contact> getContacts() {
        LinkedHashMap<String, String> contacts = this.fetchContacts();
        ArrayList<Contact> results = new ArrayList<>();

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
