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

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }
}