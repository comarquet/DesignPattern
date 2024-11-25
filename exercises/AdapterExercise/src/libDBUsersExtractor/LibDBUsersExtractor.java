package libDBUsersExtractor;

import java.sql.*;
import org.sqlite.*;

public class LibDBUsersExtractor {

    /**
     * Extracts a mock list of users from a simulated SQLite database.
     *
     * It queries an "in memory" SQLite database and retuns a
     * {@link java.sql.ResultSet} containing the mock user data.
     *
     *
     * @return a {@link java.sql.ResultSet} object containing the list of users in the database,
     *         or {@code null} if a database error occurs.
     *
     * @throws RuntimeException if a database error occurs, as the exception is logged and rethrown.
     */
    public static ResultSet extractUsersFromDB() {
        try {
            // Create a mock SQLite database in memory
            Connection connection = DriverManager.getConnection("jdbc:sqlite::memory:");
            Statement statement = connection.createStatement();

            // Create a Users table
            String createTableSQL = "CREATE TABLE Users (" +
                    "id INTEGER PRIMARY KEY, " +
                    "firstName TEXT, " +
                    "lastName TEXT, " +
                    "email TEXT)";
            statement.execute(createTableSQL);

            // Insert sample data
            String insertDataSQL = "INSERT INTO Users (id, firstName, lastName, email) VALUES " +
                    "(1, 'Alice', 'Smith', 'alice@example.com'), " +
                    "(2, 'Bob', 'Johnson', 'bob@example.com'), " +
                    "(3, 'Charlie', 'Brown', 'charlie@example.com')";
            statement.execute(insertDataSQL);

            // Query the table
            String querySQL = "SELECT * FROM Users";
            return statement.executeQuery(querySQL);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
