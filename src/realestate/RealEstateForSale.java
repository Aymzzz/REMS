package realestate;

import java.util.ArrayList;

import user.Owner;

public class RealEstateForSale extends RealEstate{
    public RealEstateForSale(int id, String type, Owner owner, ArrayList<Comment> comments, String location,
            double price) {
        super(id, type, owner, comments, location, price);
    }

    private double price;
    private boolean isBuyNow;

    public double getPrice() {
        return price;
    }

}