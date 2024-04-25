package user;

import java.util.List;

import realestate.RealEstate;

public class Manager extends User {
    
    public Manager(int id, String name, int age, String email, String phone) {
        super(id, name, age, email, phone);
    }

    private List<RealEstate> realEstates;

    
    /** 
     * @return List<RealEstate>
     */
    public List<RealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(List<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public void assignHouseKeeper(User name) {
         if (housekeeper instanceof Housekeeper) {
            Housekeeper hk = (Housekeeper) housekeeper;
            if (realEstates.contains(realEstate)) {
                hk.setAssignedBuilding(realEstate);
                System.out.println("Housekeeper " + hk.getName() + " assigned to clean " + realEstate.getName());
            } else {
                System.out.println("This manager does not manage the specified real estate.");
            }
        } else {
            System.out.println("Only housekeepers can be assigned to clean buildings.");
        }
    }
    }

    public void addRealEstate(RealEstate realEstate) {
        realEstates.add(realEstate);
        System.out.println("Real Estate listing added under manager " + getName() + ": " + realEstate.getName());
    }

}
