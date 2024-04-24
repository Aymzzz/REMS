package user;

import java.sql.Date;

import realestate.RealEstate;

public class Renter extends User {
    
    public Renter(int id, String name, int age, String email, String phone) {
        super(id, name, age, email, phone);
    }

    private RealEstate realEstate;
    private RenterType renterType;

    public void viewBookingHistory() {
        
          System.out.println("Booking history viewed.");

    }

    public void bookProperty(int propertyID, Date startDate, Date endDate) {
        
         System.out.println("Property " + propertyID + " booked from " + startDate + " to " + endDate + ".");

    }

    public void payRent(int propertyID, double amount) {
  
    }

    public void rateStay(int propertyID, int rating) {

    }

    public void cancelBooking(int propertyID) {

        System.out.println("Booking for property ID " + propertyID + " has been cancelled.");

    }

    public enum RenterType {
        Worker, Student;
    }
}
