package user;

public class Buyer extends User {
    private double budget;
    private String amount;

    public Buyer(int id, String name, int age, String email, String phone, double budget, String amount) {
        super(id, name, age, email, phone);
        this.budget = budget;
    }
    
     public void placeBid(double bidAmount) {
        if (bidAmount <= budget) {
            System.out.println("Bid placed for $" + bidAmount);
            pendingPaymentAmount = bidAmount; // Set pending amount to the bid amount, assuming the bid wins
        } else {
            System.out.println("Bid amount exceeds budget.");
        }
    }

    
    /** 
     * @return double
     */
    public double getBudget() {
        return budget;
    }

    public void buyProperty() {
        if (pendingPaymentAmount > 0 && pendingPaymentAmount <= budget) {
            System.out.println("Attempting to buy property for $" + pendingPaymentAmount);
            proceedPayment(pendingPaymentAmount);
        } else {
            System.out.println("No pending transaction or budget exceeded.");
        }
    }


    public void proceedPayment() {

         System.out.println("Payment of $" + amount + " processed.");
    }
}
