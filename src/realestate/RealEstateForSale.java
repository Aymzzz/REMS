package realestate;

import java.util.ArrayList;

import user.Owner;

public class RealEstateForSale extends RealEstate{
    private boolean isBuyNow;

    public RealEstateForSale(int id, String type, Owner owner, ArrayList<Comment> comments, String location,
            double price, boolean isBuyNow) {
        super(id, location, owner, comments, location, price);
        this.isBuyNow= isBuyNow;
    }
    
    public boolean isBuyNow() {
        return isBuyNow;
    }

    public void setBuyNow(boolean buyNow) {
        isBuyNow = buyNow;
    }

    public String toString(){
        return "Is the realestate for sale? " + isBuyNow;
    }
}
