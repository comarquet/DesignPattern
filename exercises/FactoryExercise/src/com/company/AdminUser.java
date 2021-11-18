package com.company;

public class AdminUser extends AbstractUser {
    protected String adminRights;

    public AdminUser(String email, String name, String adminRights) {
        super(email, name);
        this.adminRights = adminRights;
    }

    @Override
    public void saveToDatabase() {
        System.out.println("Saving to database ADMIN_USERS : ");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("AdminRights : " + adminRights);
    }
}
