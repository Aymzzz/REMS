package realestate;

import user.Owner;

import java.util.ArrayList;
import java.util.Scanner;

public class RealEstate {
    protected int id;
    protected String type;
    private Owner owner;
    private ArrayList<Comment> comments;
    private String location;
    private double price;
    private RealEstateType reType;


    public RealEstate(int id, String type, Owner owner, ArrayList<Comment> comments, String location, double price) {
        this.id = id;
        this.type = type;
        this.owner = owner;
        this.comments = comments;
        this.location = location;
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public enum RealEstateType{
        Commercial, Residential;
    }

    public void addComment(Comment comment) throws IllegalArgumentException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the comment: ");
            String content = scanner.nextLine();    
            comment.postComment(content);
        }
        comments.add(comment);
    }

    public int getId(){
        return id;
    }

    /**
     * @return the reType
     */
    public RealEstateType getReType() {
        return reType;
    }

    /**
     * @param reType the reType to set
     */
    public void setReType(RealEstateType reType) {
        this.reType = reType;
    }

}
