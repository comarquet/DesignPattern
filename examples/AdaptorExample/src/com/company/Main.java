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
        ContactsLibraryAdapterWithComposition adapter = new ContactsLibraryAdapterWithComposition(new ContactsLibrary());
        ContactsPrinter contactsPrinter = new ContactsPrinter(adapter);
        contactsPrinter.printContacts();
    }












    /** Solution 1 : with inheritance */
//    public static void main(String[] args) {
//        ContactsLibraryAdapter adapter = new ContactsLibraryAdapter();
//        ContactsPrinter contactsPrinter = new ContactsPrinter(adapter);
//        contactsPrinter.printContacts();
//    }

    /** Solution 2 : with composition */
//    public static void main(String[] args) {
//        ContactsLibrary contactsLibrary = new ContactsLibrary();
//        ContactsLibraryAdapter adapter = new ContactsLibraryAdapter(contactsLibrary);
//        ContactsPrinter contactsPrinter = new ContactsPrinter(adapter);
//        contactsPrinter.printContacts();
//    }

}