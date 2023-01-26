class MyClass
{
    private string username = "admin";
    private string password = "password";

    public void SetCredentials(string username, string password)
    {
        this.username = username;
        this.password = password;
    }

    public void VulnerableSQL(string input)
    {
        string query = "SELECT * FROM users WHERE username='" + input + "' AND password='" + this.password + "'";
        // execute query
    }

    public void CompareValues(string value1, string value2)
    {
        if (value1 == value2)
        {
            // Do something
        }
    }
}
