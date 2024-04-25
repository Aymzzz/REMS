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
         System.out.println("Booking History for " + getName() + ":");

        if (bookingHistory.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (Booking booking : bookingHistory) {
                System.out.println("Property ID: " + booking.getPropertyID());
                System.out.println("Booking Date: " + booking.getBookingDate());
                System.out.println("Duration of Stay: " + booking.getDurationOfStay() + " days");
                System.out.println(); // Add a blank line for readability
            }
        }
    }

    
    /** 
     * @param propertyID
     * @param startDate
     * @param endDate
     */
    public int bookProperty(int propertyID, Date startDate, Date endDate) {

       long durationMillis = endDate.getTime() - startDate.getTime();
        int durationOfStay = (int) Math.ceil((double) durationMillis / (24 * 60 * 60 * 1000));

        // Add booking to booking history
        Booking newBooking = new Booking(propertyID, startDate, endDate, durationOfStay);
        bookingHistory.add(newBooking);

        // Display booking confirmation
        System.out.println("Property " + propertyID + " booked from " + startDate + " to " + endDate);
        System.out.println("Duration of stay: " + durationOfStay + " days");

        return durationOfStay;

    }

    public void payRent(int propertyID, double amount) {

         Scanner scanner = new Scanner(System.in);

        System.out.println("Payment Information:");
        System.out.print("Name on Card: ");
        String nameOnCard = scanner.nextLine();

        System.out.print("CVV: ");
        String cvv = scanner.nextLine();

        System.out.print("Expiration Date (MM/YYYY): ");
        String expirationDate = scanner.nextLine();

        // Simulate payment processing 
        System.out.println("Processing payment of " + amount + " for property ID " + propertyID + "...");

        // Display payment successful message
        System.out.println("Payment successful! Amount of " + amount + " paid for property ID " + propertyID);

        // Close the scanner
        scanner.close();
    }
    }

    public void rateStay(int propertyID, int rating) {
         System.out.println("Rated stay at property ID " + propertyID + " with rating: " + rating);
    }

    public void cancelBooking(int propertyID){
        Iterator<Booking> iterator = bookingHistory.iterator();
        boolean bookingFound = false;

        while (iterator.hasNext()) {
            Booking booking = iterator.next();
            if (booking.getPropertyID() == propertyID) {
                iterator.remove(); // Remove the booking from the booking history
                bookingFound = true;
                System.out.println("Booking for property ID " + propertyID + " has been cancelled.");
                break; // Exit loop after canceling the booking
            }
        }

        if (!bookingFound) {
            System.out.println("No booking found for property ID " + propertyID);
        }
}
}
