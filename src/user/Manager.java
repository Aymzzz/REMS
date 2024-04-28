package user;

import java.util.List;
import java.util.ArrayList;
import realestate.RealEstate;

public class Manager extends User {
    private List<RealEstate> realEstates;

    public Manager(int id, String name, int age, String email, String phone) {
        super(id, name, age, email, phone);
        realEstates = new ArrayList<>();
    }

    public List<RealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(List<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public void assignHouseKeeper(HouseKeeper housekeeper, RealEstate realEstate) {
        if (realEstates.contains(realEstate)) {
            housekeeper.setAssignedBuilding(realEstate);
            System.out.println("Housekeeper " + housekeeper.getName() + " assigned to clean " + realEstate.getName());
        } else {
            System.out.println("This manager does not manage the specified real estate.");
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
