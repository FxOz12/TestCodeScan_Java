public class MyClass {
    private String username = "admin";
    private String password = "password";
    
    public MyClass() {}
    
    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void vulnerableSQL(String input) {
        String query = "SELECT * FROM users WHERE username='" + input + "' AND password='" + this.password + "'";
        // execute query
    }
    
    public void vulnerableXSS(String input) {
        String output = "<script>" + input + "</script>";
        // display output
    }
    
    public void inefficientConstructor(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
        }
        // use sb.toString()
    }
    
    public void vulnerablePathTraversal(String input) {
        File file = new File(input);
        if (file.exists()) {
          // process file
        }
    }
}
