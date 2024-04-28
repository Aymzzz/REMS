package user;

import realestate.RealEstate;

public class HouseKeeper extends User {
    private Manager manager;
    private RealEstate assignedBuilding;

    public HouseKeeper(int id, String name, int age, String email, String phone, Manager manager) {
        super(id, name, age, email, phone);
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public RealEstate getAssignedBuilding() {
        return assignedBuilding;
    }

    public void setAssignedBuilding(RealEstate assignedBuilding) {
        if (this.manager != null && this.manager.getRealEstates().contains(assignedBuilding)) {
            this.assignedBuilding = assignedBuilding;
            System.out.println("Housekeeper " + this.getName() + " is now assigned to " + assignedBuilding.getName());
        } else {
            System.out.println("This housekeeper cannot be assigned to the building as it is not managed by their manager.");
        }
    }

    public void cleanProperty() {
        if (assignedBuilding != null) {
            System.out.println("Cleaning property: " + assignedBuilding.getName());
        } else {
            System.out.println("No property assigned for cleaning.");
        }
    }
}
