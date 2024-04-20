package user;

import java.util.List;

import realestate.RealEstate;

public class Owner extends User {
    private List<RealEstate> ownedRealEstate;

     public Owner(int id, String name, int age, String email, String phone) {
        super(id, name, age, email, phone);
        this.ownedRealEstate = new ArrayList<>();  
    }

    
    public List<RealEstate> getOwnedRealEstate() {
        return ownedRealEstate;
    }

    public void addRealEstate(RealEstate realEstate) {
        if (realEstate != null) {
            ownedRealEstate.add(realEstate);
        }
    }
}
