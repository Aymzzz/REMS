package realestate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import user.Owner;
import user.Renter;

/**
 * Represents a real estate property.
 * This class inherits from RealEstate class
 * It is dedicated for all the properties that are for rent
 *
 * @author SBAI Aymane
 */

public class RealEstateForRent extends RealEstate{
    private Date startDate;
    private Date endDate;
    private List<Renter> renters;  
    private RentalStatus status;

    public RealEstateForRent(String name, int id, String type, Owner owner, ArrayList<Comment> comments, String location, double price, Unit[] units, Date startDate, Date endDate, List<Renter> renters, RentalStatus status) {
        super(name, id, owner, comments, location, price, units);
        this.startDate = startDate;
        this.endDate = endDate;
        this.renters = renters;
        this.status = status;
    }
    

    
    /** 
     * @return Date
     */
    public Date getStartDate() {
        return startDate;
    }

    
    /** 
     * @param starDate
     */
    public void setStartDate(Date starDate) {
        this.startDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Renter> getRenters() {
        return renters;
    }

    public void setRenters(List<Renter> renters) {
        this.renters = renters;
    }

    public RentalStatus getStatus() {
        return status;
    }

    public void setStatus(RentalStatus status) {
        this.status = status;
    }

    public enum RentalStatus{
        Available, Rented;
    }


    public String toString(){
        return "Real estate for rent: " + startDate + ", endDate=" + endDate + ", renters=" + renters + ", status=" + status + "cost = " + getPrice();
    }
}
