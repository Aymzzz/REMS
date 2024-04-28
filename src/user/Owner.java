package user;


import java.util.iterator;
import java.util.List;
import java.util.ArrayList;
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
        if (realEstate != null && !ownedRealEstate.contains(realEstate)) {
            ownedRealEstate.add(realEstate);
            System.out.println("Real estate added to your properties.");
        } else {
            System.out.println("This real estate is already added or is null.");
        }
    }
}
