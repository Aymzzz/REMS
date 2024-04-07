package realestate;

import java.util.List;

public class Comment {
    private int commentID;
    private int authorID;
    private int propertyID;
    private String content;
    private List<Comment> replies;

    public void postComment(String content) {
    }

    public void reply(Comment comment, String content) {
    }
}