package user;
import java.util.*;

import realestate.RealEstateForRent;
/**
 * Represents the renter of a real estate for rent 
 * Each renter can book a property for a speciic interval of time, 
 *
 * @author Hiba
 */
public class Renter extends User {

    public Renter(int id, String name, int age, String email, String phone, Account account) {
        super(id, name, age, email, phone, account);
    }

    private List<RealEstateForRent> bookingHistory = new ArrayList<>();
    

    public void viewBookingHistory() {
        System.out.println("Booking History for " + getName() + ":");

        if (bookingHistory.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (RealEstateForRent booking : bookingHistory) {
                System.out.println("Property ID: " + booking.getId());
                System.out.println("Booking Date: " + booking.getStartDate());
                System.out.println("End of booking: " + booking.getEndDate());
                System.out.println(); // Add a blank line for readability
            }
        }
    }

    public void bookProperty(RealEstateForRent newBooking) {
        // Add booking to booking history
        bookingHistory.add(newBooking);
        // Display booking confirmation
        System.out.println("Property " + newBooking.getId() + " booked from " + newBooking.getStartDate() + " to " + newBooking.getEndDate());
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
    

    public void rateStay(int propertyID, int rating) {
        System.out.println("Rated stay at property ID " + propertyID + " with rating: " + rating);
    }

    public void cancelBooking(int propertyID) {
        Iterator<RealEstateForRent> iterator = bookingHistory.iterator();
        boolean bookingFound = false;

        while (iterator.hasNext()) {
            RealEstateForRent booking = iterator.next();
            if (booking.getId() == propertyID) {
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
