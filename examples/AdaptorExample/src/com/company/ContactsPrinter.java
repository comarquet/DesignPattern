package com.company;

import java.util.AbstractList;

public class ContactsPrinter {
    private ContactsGetterInterface contactsGetter;

    public ContactsPrinter(ContactsGetterInterface contactsGetter) {
        this.contactsGetter = contactsGetter;
    }

    public void printContacts() {
        AbstractList<Contact> contacts = this.contactsGetter.getContacts();
        for (Contact contact : contacts) {
            System.out.println("Name : " + contact.getName() + ", phone : " + contact.getPhone());
        }
    }
}
