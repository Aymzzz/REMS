package user;
/**
 *
 * @author Hiba
 */
public class Account{

    private String username;
    private String password;
    private boolean isLoggedIn;

     public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
    }

     
     /** 
      * @return String
      */
     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

     public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Incorrect username or password. Please try again.");
            return false;
        }
    }

    public boolean signUp(String newUsername, String newPassword) {
        if (isLoggedIn) {
            System.out.println("You are already logged in. Please logout first.");
            return false;
        }

        // set new username and password
        username = newUsername;
        password = newPassword;
        isLoggedIn = true;
        System.out.println("Sign up successful. You are now logged in.");
        return true;
    }

    public void logout() {
        isLoggedIn = false;
        System.out.println("Logged out successfully.");
    }

}
