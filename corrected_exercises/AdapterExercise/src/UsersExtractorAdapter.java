import libCSVUserPrinter.User;
import libCSVUserPrinter.UserGetter;
import libDBUsersExtractor.LibDBUsersExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersExtractorAdapter implements UserGetter {

    @Override
    public List<User> getUserList() {
        try {
            ResultSet resultSet = LibDBUsersExtractor.extractUsersFromDB();

            List<User> users = new ArrayList<>();

            while (resultSet.next()) {
                // you can access fields of the current result pointed by the iterator
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String email = resultSet.getString("email");


                User user = new User(firstName + " " + lastName, email);
                users.add(user);
            }

            return users;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
