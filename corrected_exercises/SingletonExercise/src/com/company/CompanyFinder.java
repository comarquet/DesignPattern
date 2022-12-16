package com.company;

import third.party.driver.DatabaseConnection;

public class CompanyFinder {

    public static void findCompanies() {
        DatabaseConnection databaseConnection = DatabaseConnectionSingleton.getSingleton().getDatabaseConnection();
        String result = databaseConnection.makeRequest("SELECT * FROM companies");
        System.out.println("Companies results : ");
        System.out.println(result);
    }
}
