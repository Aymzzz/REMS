package user;

import java.util.List;

import realestate.RealEstate;

public class Owner extends User {
    private List<RealEstate> ownedRealEstate;

    public List<RealEstate> getOwnedRealEstate() {
        return ownedRealEstate;
    }
}