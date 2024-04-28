package user;
/**
 * Represents a buyer and the functionalities he has 
 * 
 * @author Hiba
 */
public class Buyer extends User {
    private double budget;
    private double paymentAmount = 0.0; 

    public Buyer(int id, String name, int age, String email, String phone, double budget, Account account) {
        super(id, name, age, email, phone, account);
        this.budget = budget;
    }
    
    public void placeBid(double amount) {
        if (amount <= budget) {
            System.out.println("Bid placed for $" + amount);
            paymentAmount = amount; 
        } else {
            System.out.println("Bid amount exceeds budget. Cannot place bid");
        }
    }

    public double getBudget() {
        return budget;
    }

    public void buyProperty() {
        if (paymentAmount > 0 && paymentAmount <= budget) {
            System.out.println("Attempting to buy property for $" + paymentAmount);
            proceedPayment(); 
        } else {
            System.out.println("No pending transaction or budget exceeded.");
        }
    }

    public void proceedPayment() {
        System.out.println("Payment of $" + paymentAmount + " processed.");
    }
}
