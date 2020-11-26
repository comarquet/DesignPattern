package com.company;

public class Contact {
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    private String name;
    private String phone;
}
