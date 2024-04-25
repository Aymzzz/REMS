package user;

public class Contractor extends User {

    // Auto-generated constructor stub
    public Contractor(int id, String name, int age, String email, String phone) {
        super(id, name, age, email, phone); // Call to the superclass (User) constructor
    
    }

    // Method for a contractor to place a bid on a project
    public void bidForProject(String projectDetails, double bidAmount) {
        System.out.println("Bid placed by Contractor " + getName() + " for project '" + projectDetails + "' with amount: $" + bidAmount);
    }
    
    // Method for a contractor to update the status of a project
    public void updateWorkStatus(String projectDetails, String status) {
        System.out.println("Update from Contractor " + getName() + " for project '" + projectDetails + "': Status - " + status);
    }
    
    // Method for listing services provided by the contractor
    public void listServices() {
        System.out.println("Listing services provided by Contractor " + getName());
        // Example services - this would usually be dynamic, possibly loaded from a database
        System.out.println("- Plumbing");
        System.out.println("- Electrical");
        System.out.println("- Remodeling");
    }
}
