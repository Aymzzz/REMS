package user;

import java.util.List;
import java.util.ArrayList;

import realestate.RealEstate;

/**
 * Represents the owner of real estate properties.
 * Each owner can add and manage their owned real estate properties.
 * 
 * @author Hiba
 */
public class Owner extends User {
    private List<RealEstate> ownedRealEstate;

    /**
     * Constructs a new Owner object.
     * 
     * @param id      The ID of the owner.
     * @param name    The name of the owner.
     * @param age     The age of the owner.
     * @param email   The email address of the owner.
     * @param phone   The phone number of the owner.
     * @param account The account associated with the owner.
     */
    public Owner(int id, String name, int age, String email, String phone, Account account) {
        super(id, name, age, email, phone, account);
        this.ownedRealEstate = new ArrayList<>();
    }

    /**
     * Get the list of owned real estate properties.
     * 
     * @return The list of owned real estate properties.
     */
    public List<RealEstate> getOwnedRealEstate() {
        return ownedRealEstate;
    }

    /**
     * Add a real estate property to the list of owned properties.
     * 
     * @param realEstate The real estate property to be added.
     * @throws DuplicateRealEstateException If the real estate property is already added or is null.
     */
    public void addRealEstate(RealEstate realEstate) throws DuplicateRealEstateException {
        if (realEstate == null) {
            throw new IllegalArgumentException("Real estate cannot be null.");
        }

        if (!ownedRealEstate.contains(realEstate)) {
            ownedRealEstate.add(realEstate);
            System.out.println("Real estate added to your properties.");
        } else {
            throw new DuplicateRealEstateException("This real estate is already added.");
        }
    }

    /**
     * Represents an exception that occurs when attempting to add a duplicate real estate property.
     */
    public static class DuplicateRealEstateException extends Exception {
        public DuplicateRealEstateException(String message) {
            super(message);
        }
    }
}
