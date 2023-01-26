class MyClass {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public void login() {
        String inputUsername = "admin";
        String inputPassword = "password123";
        if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }

    public void vulnerableSQL(String userId) {
        String query = "SELECT * FROM users WHERE id = " + userId;
        // execute the query
    }

    public boolean compareValues(int value1, int value2) {
        return value1 == value2;
    }
}
