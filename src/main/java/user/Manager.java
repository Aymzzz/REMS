package user;

import java.util.ArrayList;
import java.util.List;

import realestate.RealEstate;
/**
 *
 * @author Hiba
 */
public class Manager extends User {
    
    private List<RealEstate> realEstates;

    public Manager(int id, String name, int age, String email, String phone, Account account) {
        super(id, name, age, email, phone, account);
        this.realEstates = new ArrayList<>(); 
    }

    /** 
     * @return List<RealEstate>
     */
    public List<RealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(List<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public void assignHouseKeeper(User housekeeper, RealEstate realEstate) {
        if (housekeeper instanceof HouseKeeper) {
            HouseKeeper hk = (HouseKeeper) housekeeper;
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

    public void addRealEstate(RealEstate realEstate) {
        if (realEstate != null) {
            realEstates.add(realEstate);
            System.out.println("Real Estate listing added under manager " + getName() + ": " + realEstate.getName());
        } else {
            System.out.println("Real estate cannot be null.");
        }
    }
}

