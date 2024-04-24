package realestate;

import java.util.ArrayList;
import java.util.List;

public class Comment {
    private int commentID;
    private int authorID;
    private int propertyID;
    private String content;
    private List<Comment> replies;
    private String text;

    // Constructor
    public Comment(int commentID, int authorID, int propertyID, String content) {
        this.commentID = commentID;
        this.authorID = authorID;
        this.propertyID = propertyID;
        this.content = content;
        this.replies = new ArrayList<>();
    }

    
    /** 
     * @return int
     */
    // Getters and Setters
    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getReplies() {
        return replies;
    }

    public void setReplies(List<Comment> replies) {
        this.replies = replies;
    }

    // Methods
    public void postComment(String content) {
        // Check if the content is not empty or null
        //Set this as exception later!!!!
        if (content != null && !content.isEmpty()) {
            // Create a new Comment object with the current comment's content
            Comment newComment = new Comment(-1, this.authorID, this.propertyID, content);
            // Add the new Comment object to the replies list
            this.replies.add(newComment);
        } else {
            System.out.println("Error: Cannot post an empty comment.");
        }
    }

    public void reply(Comment comment, String content) {
        // Check if the content is not empty or null
        //Set this as exception later!!!!
        if (content != null && !content.isEmpty()) {
            // Create a new Comment object with the current comment's content
            Comment newComment = new Comment(-1, this.authorID, this.propertyID, content);
            // Set the new Comment object's parent Comment
            newComment.setParentComment(this);
            // Add the new Comment object to the parent Comment's replies list
            this.replies.add(newComment);
        } else {
            System.out.println("Error: Cannot post an empty comment.");
        }
    }
    // Add a setParentComment method to the Comment class
    public void setParentComment(Comment parentComment) {
        this.propertyID = parentComment.getPropertyID();
    }

    public String getText() {
        return text;
    }
}
