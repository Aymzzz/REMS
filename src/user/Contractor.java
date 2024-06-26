package user;

public class Contractor extends User {

    // Auto-generated constructor stub
    public Contractor(int id, String name, int age, String email, String phone,  Account account) {
        super(id, name, age, email, phone, account); // Call to the superclass (User) constructor
    
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
