package realestate;

import java.sql.Date;
import java.util.List;

import user.Owner;
import user.Renter;

public class RealEstateForRent extends RealEstate{
    private Date starDate;
    private Date endDate;
    private List<Renter> renters;  
    private RentalStatus status;
    private Date startDate;

    public RealEstateForRent(int id, String type, Owner owner, List<Comment> comments, String location, double price, Date startDate, Date endDate, List<Renter> renters, RentalStatus status) {
        super(id, type, owner, comments, location, price);
        this.startDate = startDate;
        this.endDate = endDate;
        this.renters = renters;
        this.status = status;
    }

    

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
