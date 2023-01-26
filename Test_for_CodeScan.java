class MyClass {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";
    
    private String name;
    private int id;

    public MyClass(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public boolean equals(Object o) {
        if (o == null) return false;
        if (MyClass.class != o.getClass()) return false;
        MyClass other = (MyClass)o;
        if (!name.equals(other.name)) return false;
        if (id != other.id) return false;  // Comparison of identical values
        return true;
    }
	
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
}
