package org.thirdpartyB;

import java.util.List;

public class ContactsPrinter {
    private ContactsGetterInterface contactsGetter;

    public ContactsPrinter(ContactsGetterInterface contactsGetter) {
        this.contactsGetter = contactsGetter;
    }

    public void printContacts() {
        List<Contact> contacts = this.contactsGetter.getContacts();
        for (Contact contact : contacts) {
            System.out.println("Name : " + contact.getName() + ", phone : " + contact.getPhone());
        }
    }
}
