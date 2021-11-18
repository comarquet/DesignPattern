package third.party.driver;

import javax.xml.crypto.Data;

public class DatabaseConnection {
    private static int nbOfConnections = 0;

    public DatabaseConnection() {
        if (nbOfConnections > 0) throw new RuntimeException("There is already a database connection instanciated, you can't create a new one");
        nbOfConnections++;
    }

    public String makeRequest(String SQLRequest) {
        if (SQLRequest.equals("SELECT * FROM users")) {
            return "Alice; Bob;";
        } else if (SQLRequest.equals("SELECT * FROM companies")) {
            return "Schneider; Centrale;";
        } else {
            return "NO RESULT";
        }
    }
}
