package realestate;

import java.util.List;

import user.Contractor;
import user.HouseKeeper;
import user.Manager;
import user.User;

public class RealEstateAgency {
    private List<RealEstate> realEstates;
    private List<Manager> managers;
    private List<HouseKeeper> houseKeepers;
    private List<Contractor> contractors;
    private List<Comment> comments;
    private List<User> users;

    public List<RealEstate> search() {
        return realEstates;
    }

    public void addRealEstate(RealEstate newRealEstate) {
    }

    public void removeRealEstate(RealEstate newRealEstate) {
    }
}