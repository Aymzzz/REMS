package user;

import java.util.List;

import realestate.RealEstate;

public class Manager extends User {
    private List<RealEstate> realEstates;

    public List<RealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(List<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public void assignHouseKeeper(User name) {

    }
}