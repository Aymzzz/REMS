package user;

public class Buyer extends User {
    private double budget;
    private String amount;

    public Buyer(int id, String name, int age, String email, String phone, double budget, String amount) {
        super(id, name, age, email, phone);
    }
    public void placeBid() {
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
