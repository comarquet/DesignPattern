package com.company;

/**
 * Ce code va renvoyer une exception car deux instances de DatabaseConnection sont créées, alors qu'une
 * seule est possible. DatabaseConnection est une librairie tierce que nous ne pouvons pas modifier.
 *
 * Utiliser le pattern Singleton pour résoudre ce problème
 */

public class Main {

    public static void main(String[] args) {
        CompanyFinder.findCompanies();
        UserFinder.findUsers();
    }
}
