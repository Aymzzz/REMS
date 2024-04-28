package com.mycompany.app;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import realestate.*;
import user.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Badr
 */
public class App {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static User currentUser;
    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<RealEstate> realEstates = new ArrayList<>();

    /**
     *
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        try {
            realEstates= RealEstateAgency.loadRealEstates();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            users= RealEstateAgency.loadUsers();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scanner scanner = new Scanner(System.in);
        Account currentAccount = null;
        int choice;
        boolean exit = false;
        while (!exit) {
            while(currentAccount == null){
            System.out.println("\n===== Real Estate Management System Menu =====");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.println("=============================================");
            System.out.print("Enter the number corresponding to what you want to perform: ");

            
            try {
                choice = scanner.nextInt();
                scanner.nextLine();//Consume the newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            switch(choice){
                case 1:
                        System.out.print("Enter username: ");
                        String Username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String Password = scanner.nextLine();
                        currentAccount = new Account("0", "0"); // Create a new Account object
                        currentAccount.login(Username, Password);
                        currentUser = new User(0, "default", 0, "default", "default", currentAccount);
                        break;
                    case 2:
                    if (currentUser != null) {
                        System.out.println("Please log out before creating a new account.");
                    } else {
                        currentAccount = new Account(null, null);
                        System.out.print("Enter username: ");
                        String regUsername = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String regPassword = scanner.nextLine();
                        currentAccount.signUp(regUsername, regPassword);
                        currentUser = new User(0, "default", 0, "default", "default", currentAccount);
                        users.add(currentUser);
                       
                try {
                    RealEstateAgency.saveUsers();
                } catch (IOException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
                    }
                    break;
                case 3:
                    System.out.println("Exiting Real Estate Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            }
            
                boolean exit1=false;
                while(!exit1){
                System.out.println("\n===== Real Estate Management System Menu =====");
                System.out.println("1. Search");
                System.out.println("2. Manage Real Estate (for Managers only!!!)");
                System.out.println("3. Exit");
                System.out.println("=============================================");
                System.out.print("Enter the number corresponding to what you want to perform: "); 
            
            try {
                choice = scanner.nextInt();
                scanner.nextLine();//Consume the newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            switch(choice){
                case 1:
                    System.out.println("Please enter the name of the property you are looking for.\nType 0 if you don't want to specify:");
                    String name = scanner.nextLine();
                    System.out.println("Please enter your minimum price.\n Type 0 if you prefer not to specify:");
                    double minPrice = scanner.nextDouble();
                    System.out.println("Please enter your maximum price.\n Type 0 if you prefer not to specify:");
                    double maxPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Please enter your desired location.\nType 0 if you prefer not to specify:");
                    String location = scanner.nextLine();
                    ArrayList<RealEstate> foundRealEstates = RealEstateAgency.search(realEstates, name, minPrice, maxPrice, location);
                    if(foundRealEstates!= null) {
                        System.out.println("Do you want to sort them by price?\nType 1 if yes, 0 if no:");
                        int sortingchoice = scanner.nextInt();
                        scanner.nextLine();//Consume the newline character
                        if(sortingchoice==1) RealEstateAgency.sortRealEstates(foundRealEstates);
                        RealEstateAgency.displayRealEstates(foundRealEstates);
                    } else {
                        System.out.println("No properties found matching your search criteria.");
                    }
                    break;
                case 2:
                    if(currentUser instanceof Manager){
                        boolean exit2=false;
                    while(!exit2){
                        System.out.println("\n===== Real Estate Management System Menu =====");
                        System.out.println("1. Add a new real estate property to the system:");
                        System.out.println("2. Remove a real estate property from the system ");
                        System.out.println("3. Exit");
                        System.out.println("=============================================");
                        System.out.print("Enter the number corresponding to what you want to perform: "); 
            
                        try {
                            choice = scanner.nextInt();
                            scanner.nextLine();//Consume the newline character
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            continue;
                        }
                        switch(choice){
                            case 1: 
                                System.out.println("Please enter the name of the property you want to add.\n");
                                name = scanner.nextLine();
                                System.out.println("Please enter the price.\n");
                                double price = scanner.nextDouble();
                                System.out.println("Please enter the location.\n");
                                location = scanner.nextLine();
                                RealEstate r = new RealEstate(name, location, price);
                                RealEstateAgency.addRealEstate(r);
                                try {
                                    RealEstateAgency.saveRealEstates();
                                } catch (IOException ex) {
                                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                break;
                            case 2: 
                                System.out.println("Please enter the name of the property you want to remove.\n");
                                name = scanner.nextLine();
                                System.out.println("Please enter the price.\n");
                                price = scanner.nextDouble();
                                System.out.println("Please enter the location.\n");
                                location = scanner.nextLine();
                                r = new RealEstate(name, location, price);
                                RealEstateAgency.removeRealEstate(r);
                                break;
                            case 3:
                                exit2=true;
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;    
                        }
                    }
                    }
                    else{
                        System.out.println("Access denied!!!");
                    }
                    break;
                case 3:
                    exit=true;
                    exit1=true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;    
                
           }
        }
        
        }                       
        
        
        /*     // This part was done by SBAI Aymane to test my part of the project.
        Comment comment1 = new Comment(1, 1, 1, "This is an interesting property!");
        Comment comment2 = new Comment(2, 2, 2, "I agree, it's perfect for my needs!");
        Comment comment3 = new Comment(3, 3, 3, "Nah mid");

        // creating a new BuyNow sale type
        BuyNow buyNowSaleType = new BuyNow(100000.0f, new user.Buyer(0, "name", 50, null, null, 0, null));

        //posting a comment on the property
        comment1.postComment("Welcome to the property discussion");

        //replying to the comment
        comment2.reply(comment1, "Thanks for sharing your thoughts man");
        comment3.reply(comment2, "You're welcome!");

        //Prints the comments and replies
        System.out.println("Comment 1: " + comment1.getContent());
        System.out.println("Comment 2: " + comment2.getContent());
        System.out.println("Comment 3: " + comment3.getContent());

        //Printing  the replies
        System.out.println("Replies to Comment 1:");
        for (Comment reply : comment1.getReplies()) {
            System.out.println("- " + reply.getContent());
        }

        //Printing the replies to the replies - using the collections
        System.out.println("Replies to Comment 2:");
        for (Comment reply : comment2.getReplies()) {
            System.out.println("- " + reply.getContent());
        }

        //Printing the replies to the replies to the replies
        System.out.println("Replies to Comment 3:");
        for (Comment reply : comment3.getReplies()) {
            System.out.println("- " + reply.getContent());
        }

        //prints the BuyNow sale type details for better understanding
        System.out.println("BuyNow Sale Type Details:");
        System.out.println("Price: " + buyNowSaleType.getPrice());
        System.out.println("Buyer: " + buyNowSaleType.getBuyer().getName());
        System.out.println("Buyer's Email: " + buyNowSaleType.getBuyer().getEmail());
    
         
         */
       /* // Added by Hiba Aouahchi to create a list of users
        List<User> users = new ArrayList<>();

        // Create accounts for users
        Account account1 = new Account("hiba", "password1");
        Account account2 = new Account("alien", "password2");

        // Create users with associated accounts
        User user1 = new User(1, "kacy", 30, "email1", "123456", account1);
        User user2 = new User(2, "Alice", 25, "email2", "654321", account2);

        // Test sign up
        account1.signUp("user1", "password1");
        account2.signUp("user2", "password2");

        // Test login
        account1.login("user1", "password1");
        account2.login("user2", "password2");
        account1.login("user3", "password3"); // Login with non-existing user

        // Test logout
        account1.logout();

        
        // Test viewProfile and updateProfile
        user1.viewProfile();
        user1.updateProfile("John smith", 35, "john@gmaim.com", "789012");
        user1.viewProfile();
        
        // Test updateName, updateAge, updateEmail, and updatePhoneNumber
        user1.updateName();
        user1.updateAge();
        user1.updateEmail();
        user1.updatePhoneNumber();
        
        // Test deleteAccount
        user2.deleteAccount();
        
        // Test sendMessage
        user1.sendMessage("Hello, Alice!");
        
        // Test retrieveUserInfo
        user1.retrieveUserInfo();
        
        // Test browseProperties
        System.out.println("User 1 is browsing properties: " + user1.browseProperties());
        
        // Test viewPropertyDetails
        user1.viewPropertyDetails(101);
        
        // Test bookmarkProperty
        user1.bookmarkProperty(101);
        
        // Test contactOwner
        user1.contactOwner(101, "I'm interested in your property.");
        
        // Test addComment
        Comment comment = new Comment(1, 1, 101, "This is a great property!");
        user1.addComment(comment);
        
        // Test likeProperty and dislikeProperty
        user1.likeProperty(101);
        user1.dislikeProperty(102);
        
        // Test viewLikedProperties and viewDislikedProperties
        user1.viewLikedProperties();
        user1.viewDislikedProperties();
        */
    System.exit(0);
    }
}
  
