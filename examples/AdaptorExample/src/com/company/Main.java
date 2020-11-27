package com.company;

import org.thirdparty.ContactsLibrary;

public class Main {

    /**
     * Goal : we must print the contact obtained by our service ContactsLibrary (imported
     * from a third party library, we cannot modify its code), using our printing service
     * ContactsPrinter.
     *
     * @param args
     */
    public static void main(String[] args) {

        // The code below doesn't work
        //ContactsPrinter.printContacts(new ContactsLibrary());

        //ContactsLibrary contactsLibrary = new ContactsLibrary();
        ContactsLibraryAdapter adapter = new ContactsLibraryAdapter();

        ContactsPrinter contactsPrinter = new ContactsPrinter(adapter);
        contactsPrinter.printContacts();
    }
}