package user;

import java.sql.Date;

public class Renter extends User {
    private RealEstate realEstate;
    private RenterType renterType;

    public void viewBookingHistory() {

    }

    public void bookProperty(int propertyID, Date startDate, Date endDate) {

    }

    public void payRent(int propertyID, double amount) {
  
    }

    public void rateStay(int propertyID, int rating) {

    }

    public void cancelBooking(int propertyID) {

    }

    public enum RenterType {
        Worker, Student;
    }
}