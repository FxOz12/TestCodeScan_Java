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

    public boolean equals(Object o) {
		if (o == null) return false;
		if (MyClass.class != o.getClass()) return false;
		Myclass other = (MyClass)o;
		if (!name.equals(o.name)) return false;
		if (id != id) return false;  // Comparison of identical values
		return true;
	}
}
