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

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public List<HouseKeeper> getHouseKeepers() {
        return houseKeepers;
    }

    public void setHouseKeepers(List<HouseKeeper> houseKeepers) {
        this.houseKeepers = houseKeepers;
    }

    public List<Contractor> getContractors() {
        return contractors;
    }

    public void setContractors(List<Contractor> contractors) {
        this.contractors = contractors;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<RealEstate> search() {
        return realEstates;
    }

    public void addRealEstate(RealEstate newRealEstate) {
    }

    public void removeRealEstate(RealEstate newRealEstate) {
    }
}