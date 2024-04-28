/**
 * Represents a real estate property for sale.
 *
 * @author Tabnine
 */
package realestate;

import java.util.ArrayList;

import user.Owner;

/**
 * A subclass of {@link RealEstate} representing a real estate property for sale.
 *
 * @author SBAI Aymane
 */
public class RealEstateForSale extends RealEstate {

    private boolean isBuyNow;

    /**
     * Constructs a new instance of {@link RealEstateForSale}.
     *
     * @param id                 The unique identifier for the real estate property.
     * @param owner               The owner of the real estate property.
     * @param comments            A list of comments related to the real estate property.
     * @param location            The location of the real estate property.
     * @param price               The price of the real estate property.
     * @param units               The units in the real estate property
     * @param isBuyNow            A boolean indicating whether the property is for immediate sale.
     */
    public RealEstateForSale(String name,int id, Owner owner, ArrayList<Comment> comments, String location,
                               double price,Unit[] units, boolean isBuyNow) {
        super(name, id, owner, comments, location, price, units);
        this.isBuyNow = isBuyNow;
    }

    /**
     * Checks if the real estate property is for immediate sale.
     *
     * @return A boolean indicating whether the property is for immediate sale.
     */
    public boolean isBuyNow() {
        return isBuyNow;
    }

    /**
     * Sets the status of the real estate property for immediate sale.
     *
     * @param buyNow A boolean indicating whether the property should be for immediate sale.
     */
    public void setBuyNow(boolean buyNow) {
        isBuyNow = buyNow;
    }

    /**
     * Returns a string representation of the real estate property's status for immediate sale.
     *
     * @return A string indicating whether the property is for immediate sale.
     */
    @Override
    public String toString() {
        return "Is the real estate for sale? " + isBuyNow;
    }
}
