package user;

/**
 * Represents a user account for authentication 
 * Each account has a username and password for login
 * 
 * @author Hiba
 */
public class Account {

    private String username;
    private String password;
    private boolean isLoggedIn;

    /**
     * Constructs a new Account object with the specified username and password.
     * 
     * @param username The username of the account.
     * @param password The password of the account.
     */
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
    }

    /**
     * Gets the username of the account.
     * 
     * @return The username of the account.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the account.
     * 
     * @param username The new username to set.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password of the account.
     * 
     * @return The password of the account.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the account.
     * 
     * @param password The new password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Checks if the user is currently logged in.
     * 
     * @return true if the user is logged in, false otherwise.
     */
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    /**
     * Authenticates the user with the provided username and password.
     * 
     * @param username The username to authenticate.
     * @param password The password to authenticate.
     * @return true if authentication is successful, false otherwise.
     */
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    /**
     * Logs in the user with the provided username and password.
     * 
     * @param username The username to log in.
     * @param password The password to log in.
     * @return true if login is successful, false otherwise.
     */
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

    /**
     * Signs up the user with the provided username and password.
     * 
     * @param newUsername The new username to sign up.
     * @param newPassword The new password to sign up.
     * @return true if sign up is successful, false otherwise.
     */
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

    /**
     * Logs out the user from the account.
     */
    public void logout() {
        isLoggedIn = false;
        System.out.println("Logged out successfully.");
    }
}
