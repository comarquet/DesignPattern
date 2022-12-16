package com.company;

public class CustomerUser extends AbstractUser {
    protected String creditCardInfo;

    public CustomerUser(String email, String name, String creditCardInfo) {
        super(email, name);
        this.creditCardInfo = creditCardInfo;
    }

    @Override
    public void saveToDatabase() {
        System.out.println("Saving to database CUSTOMERS : ");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("CreditCardInfo : " + creditCardInfo);
    }
}