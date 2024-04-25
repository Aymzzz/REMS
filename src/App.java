import realestate.Comment;
import user.Account;
import user.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import realestate.BuyNow;

public class App {
    private static List<User> users = new ArrayList<>();
    private static User currentUser;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Account currentAccount = null;
        boolean exit = false; 
        while (!exit) {
            System.out.println("\n===== Real Estate Management System Menu =====");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.println("=============================================");
            System.out.print("Enter the number corresponding to what you want to perform: ");

            int choice; 
            
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            switch(choice){
                case 1:
                    if (currentAccount != null) {
                        System.out.println("You are already logged in as " + currentAccount.getUsername());
                    }
                    else {
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        // Search for the user in the ArrayList based on username
                        User foundUser = null;
                        for (User user : users) {
                            if (user.getName().equals(username)) {
                                foundUser = user;
                                break;
                            }
                        }
                        if (foundUser != null) {
                            System.out.print("Enter password: ");
                            String password = scanner.nextLine();

                            // Perform login operation
                            if (foundUser.login(password)) {
                                System.out.println("Login successful. Welcome, " + foundUser.getName() + "!");
                                currentUser = foundUser;
                            } else {
                                System.out.println("Invalid password. Please try again.");
                            }
                        } else {
                            System.out.println("User '" + username + "' not found. Please sign up.");
                        }
                    }
                    break;
                    case 2:
                    if (currentUser != null) {
                        System.out.println("Please log out before creating a new account.");
                    } else {
                        Account newAccount = new Account(null, null);
                        newAccount.signUp();
                        users.add(new User(newAccount.getUsername(), null, null, 0));
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting Real Estate Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
                                
        
        // This part was done by SBAI Aymane to test my part of the project.
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
    }
}
