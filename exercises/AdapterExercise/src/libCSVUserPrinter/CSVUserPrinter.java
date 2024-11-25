package libCSVUserPrinter;

public class CSVUserPrinter {
    private UserGetter userGetter;
    public CSVUserPrinter(UserGetter userGetter) {
        this.userGetter = userGetter;
    }

    public void printUsersCSV() {
        userGetter.getUserList().forEach(user -> {
            System.out.printf("%s;%s\n", user.getName(), user.getEmail());
        });
    }

}
