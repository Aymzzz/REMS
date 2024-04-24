import realestate.Comment;
import realestate.BuyNow;

public class App {

    public static void main(String[] args) {
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