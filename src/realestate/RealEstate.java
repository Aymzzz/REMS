package realestate;
import user.Owner;

import java.util.ArrayList;

public class RealEstate {
    private int id;
    private String type;
    private Owner owner;
    private ArrayList<Comment> comments;
    private String location;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

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
}