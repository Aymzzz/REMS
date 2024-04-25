package user;

public class Contractor extends User {

    // Auto-generated constructor stub
    public Contractor(int id, String name, int age, String email, String phone) {
        super(id, name, age, email, phone); // Call to the superclass (User) constructor
    
    }

    
    public void bidForProject(String projectDetails, double bidAmount) {
        System.out.println("Bid placed by Contractor " + getName() + " for project '" + projectDetails + "' with amount: $" + bidAmount);
    }
    
    public void updateWorkStatus(String projectDetails, String status) {
        System.out.println("Update from Contractor " + getName() + " for project '" + projectDetails + "': Status - " + status);
    }
    

    public void listServices() {
        System.out.println("Listing services provided by Contractor " + getName());
        System.out.println("- Plumbing");
        System.out.println("- Electrical");
        System.out.println("- Remodeling");
    }
}
