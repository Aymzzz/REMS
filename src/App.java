import realestate.Comment;
import realestate.BuyNow;

public class App {
    private static List<User> users = new ArrayList<>();
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

            int choice = new nextInt();
            scanner.nextLine();
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
                            if (user.getUsername().equals(username)) {
                                foundUser = user;
                                break;
                            }
                        }
                        if (foundUser != null) {
                            System.out.print("Enter password: ");
                            String password = scanner.nextLine();

                            // Perform login operation
                            if (foundUser.login(password)) {
                                System.out.println("Login successful. Welcome, " + foundUser.getUsername() + "!");
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
                                
        
        // Create a new comment
        Comment comment1 = new Comment(1, 1, 1, "This is a great property!");

        // Create a new comment
        Comment comment2 = new Comment(2, 2, 2, "I agree, it's perfect for my needs!");

        // Create a new comment
        Comment comment3 = new Comment(3, 3, 3, "I'm also interested in this property!");

        // Create a new BuyNow sale type
        BuyNow buyNowSaleType = new BuyNow(100000.0f, new user.Buyer(0, "name", 50, null, null, 0, null));

        // Post a comment on the property
        comment1.postComment("Welcome to the property discussion!");

        // Reply to the first comment
        comment2.reply(comment1, "Thanks for sharing your thoughts!");

        // Reply to the second comment
        comment3.reply(comment2, "You're welcome! Let's keep the conversation going.");

        // Print the comments and replies
        System.out.println("Comment 1: " + comment1.getContent());
        System.out.println("Comment 2: " + comment2.getContent());
        System.out.println("Comment 3: " + comment3.getContent());

        // Print the replies
        System.out.println("Replies to Comment 1:");
        for (Comment reply : comment1.getReplies()) {
            System.out.println("- " + reply.getContent());
        }

        // Print the replies to the replies
        System.out.println("Replies to Comment 2:");
        for (Comment reply : comment2.getReplies()) {
            System.out.println("- " + reply.getContent());
        }

        // Print the replies to the replies to the replies
        System.out.println("Replies to Comment 3:");
        for (Comment reply : comment3.getReplies()) {
            System.out.println("- " + reply.getContent());
        }

        // Print the BuyNow sale type details
        System.out.println("BuyNow Sale Type Details:");
        System.out.println("Price: " + buyNowSaleType.getPrice());
        System.out.println("Buyer: " + buyNowSaleType.getBuyer().getName());
        System.out.println("Buyer's Email: " + buyNowSaleType.getBuyer().getEmail());
    }
}
