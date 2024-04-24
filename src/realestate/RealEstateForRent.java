package realestate;

import java.sql.Date;
import java.util.List;

import user.Owner;
import user.Renter;

public class RealEstateForRent extends RealEstate{
    private Date startDate;
    private Date endDate;
    private List<Renter> renters;  
    private RentalStatus status;

    public RealEstateForRent(int id, String type, Owner owner, List<Comment> comments, String location, double price, Date startDate, Date endDate, List<Renter> renters, RentalStatus status, RealEstateType reType) {
        super(id, location, owner, null, location, price);
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

    public enum RealEstateType{
        Commercial, Residential;
    }

    public String toString(){
        return "Real estate for rent: " + startDate + ", endDate=" + endDate + ", renters=" + renters + ", status=" + status + "cost = " + getPrice();
    }
}
