package com.company;

public abstract class AbstractUser {
    protected String email;
    protected String name;

    abstract public void saveToDatabase();

    public AbstractUser(String email, String name) {
        this.email = email;
        this.name = name;
    }
}
