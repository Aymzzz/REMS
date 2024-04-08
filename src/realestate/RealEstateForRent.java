package realestate;

import java.sql.Date;
import java.util.List;

import user.Renter;

public class RealEstateForRent extends RealEstate{
    private Date starDate;
    private Date endDate;
    private List<Renter> renters;  
    private RentalStatus status;

    public enum RentalStatus{
        Available, Rented;
    }
}