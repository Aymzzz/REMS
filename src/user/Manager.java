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

    }
}