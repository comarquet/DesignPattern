package com.company;

import third.party.driver.DatabaseConnection;

public class DatabaseConnectionSingleton {
    private static DatabaseConnectionSingleton singletonInstance;
    private DatabaseConnection databaseConnection;

    private DatabaseConnectionSingleton() {
        this.databaseConnection = new DatabaseConnection();
    }

    public static DatabaseConnectionSingleton getSingleton() {
        if (singletonInstance == null) {
            singletonInstance = new DatabaseConnectionSingleton();
        }
        return singletonInstance;
    }

    public DatabaseConnection getDatabaseConnection() {
        return this.databaseConnection;
    }

}
