package realestate;

import user.Owner;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a real estate property.
 *
 * @author SBAI Aymane
 */
public class RealEstate {
    protected int id;
    protected String type;
    private Owner owner;
    private ArrayList<Comment> comments;
    private String location;
    private double price;
    private RealEstateType reType; // this is for the type of real estate entity

    /**
     * Constructs a new RealEstate object with the given parameters.
     *
     * @param id          the unique identifier for the real estate property
     * @param type        the type of the real estate property
     * @param owner       the owner of the real estate property
     * @param comments    a list of comments associated with the real estate property
     * @param location    the location of the real estate property
     * @param price        the price of the real estate property
     */
    public RealEstate(int id, String type, Owner owner, ArrayList<Comment> comments, String location, double price) {
        this.id = id;
        this.type = type;
        this.owner = owner;
        this.comments = comments;
        this.location = location;
        this.price = price;
    }

    /**
     * Returns the location of the real estate property.
     *
     * @return the location of the real estate property
     */
    public String getLocation() {
        return location;
    }

    /**
     * Returns the price of the real estate property.
     *
     * @return the price of the real estate property
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the real estate property.
     *
     * @param price the new price of the real estate property
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Enum representing the types of real estate properties.
     */
    public enum RealEstateType {
        Commercial, Residential
    }

    /**
     * Adds a new comment to the real estate property.
     *
     * @param comment the comment to be added
     * @throws IllegalArgumentException if the comment is null
     */
    public void addComment(Comment comment) throws IllegalArgumentException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the comment: ");
            String content = scanner.nextLine();    
            comment.postComment(content);
        }
        comments.add(comment);
    }

    /**
     * Returns the unique identifier for the real estate property.
     *
     * @return the unique identifier for the real estate property
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the type of the real estate property.
     *
     * @return the type of the real estate property
     */
    public RealEstateType getReType() {
        return reType;
    }

    /**
     * Sets the type of the real estate property.
     *
     * @param reType the new type of the real estate property
     */
    public void setReType(RealEstateType reType) {
        this.reType = reType;
    }
}