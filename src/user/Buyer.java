package user;

public class Buyer extends User {
    private double budget;

    public Buyer(int id, String name, int age, String email, String phone, double budget) {
        super(id, name, age, email, phone);
        this.budget = budget;
    }

    public void placeBid(double bidAmount) {
        if (bidAmount <= budget) {
            System.out.println("Bid placed for $" + bidAmount);
            // Pending payment logic should be implemented if required
        } else {
            System.out.println("Bid amount exceeds budget.");
        }
    }

    public double getBudget() {
        return budget;
    }

    public void buyProperty(double pendingPaymentAmount) {
        if (pendingPaymentAmount > 0 && pendingPaymentAmount <= budget) {
            System.out.println("Attempting to buy property for $" + pendingPaymentAmount);
            proceedPayment(pendingPaymentAmount);
        } else {
            System.out.println("No pending transaction or budget exceeded.");
        }
    }

    private void proceedPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed.");
    }
}
