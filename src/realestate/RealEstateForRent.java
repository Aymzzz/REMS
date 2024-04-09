package realestate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import user.Owner;
import user.Renter;

public class RealEstateForRent extends RealEstate{
    public RealEstateForRent(int id, String type, Owner owner, ArrayList<Comment> comments, String location,
            double price) {
        super(id, type, owner, comments, location, price);
    }

    private Date starDate;
    private Date endDate;
    private List<Renter> renters;  
    private RentalStatus status;

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
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
}