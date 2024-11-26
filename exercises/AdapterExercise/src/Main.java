import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import libCSVUserPrinter.CSVUserPrinter;
import libCSVUserPrinter.User;
import libCSVUserPrinter.UserGetter;
import libDBUsersExtractor.LibDBUsersExtractor;

public class Main {

    public static void main(String[] args) throws SQLException {


        // Example on how to navigate a ResultSet object
        ResultSet resultSet = LibDBUsersExtractor.extractUsersFromDB();

        // Result set is an iterator, calling next() will place it on the
        // next result of the set of results
        while (resultSet.next()) {
            // you can access fields of the current result pointed by the iterator
            String firstName = resultSet.getString("firstName");
            System.out.printf("Name: %s\n", firstName);
        }




        // we want to generate a CSV list of all users that are in the database,
        // For this, you need to use the 2 provided libraries libDBUsersExtractor
        // and libCSVUserPrinter. Of course, you can't modify the library code.
        // Use the Adapter Design Pattern in order to sort the compatibility issue
        // between these two libraries.

        // Use the adapter pattern with composition (the one with inheritance
        // is a bit more complicated)


    }
}