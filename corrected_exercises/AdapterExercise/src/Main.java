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





        // we want to generate a CSV list of all users that are in the database,
        // For this, you need to use the 2 provided libraries libDBUsersExtractor
        // and libCSVUserPrinter. Of course, you can't modify the library code.
        // Use the Adapter Design Pattern in order to sort the compatibility issue
        // between these two libraries.

        // 1. Use the pattern with composition first
        UsersExtractorAdapter usersExtractorAdapter = new UsersExtractorAdapter();
        CSVUserPrinter csvUserPrinter = new CSVUserPrinter(usersExtractorAdapter);
        csvUserPrinter.printUsersCSV();

    }
}