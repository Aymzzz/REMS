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
    private String name;
    private int id;
    private Owner owner;
    private ArrayList<Comment> comments;
    private String location;
    private double price;
    private Unit[] units; // this is for the type of real estate entity

    /**
     * Constructs a new RealEstate object with the given parameters.
     *
     * @param name
     * @param id          the unique identifier for the real estate property
     * @param owner       the owner of the real estate property
     * @param comments    a list of comments associated with the real estate property
     * @param location    the location of the real estate property
     * @param price        the price of the real estate property
     * @param units
     */
    public RealEstate(String name,int id, Owner owner, ArrayList<Comment> comments, String location, double price, Unit[] units) {
        this.name=name;
        this.id = id;
        this.owner = owner;
        this.comments = comments;
        this.location = location;
        this.price = price;
        this.units= units;
    }
    //Following Constructor was added just for the sake of simplicity when testing the usecases
    //Author: Badr
    public RealEstate(String name, String location, double price){
        this.name=name;
        this.price=price;
        this.location=location;
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
        getComments().add(comment);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * @return the comments
     */
    public ArrayList<Comment> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the units
     */
    public Unit[] getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(Unit[] units) {
        this.units = units;
    }
    @Override
public String toString() {
    return "RealEstate{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", location='" + location + '\'' +
            '}';
}
}
