package realestate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

import user.Contractor;
import user.HouseKeeper;
import user.Manager;
import user.User;

/**
 *
 * @author Badr
 */
public class RealEstateAgency implements Serializable{
    private ArrayList<RealEstate> realEstates;
    private ArrayList<Manager> managers;
    private ArrayList<HouseKeeper> houseKeepers;
    private ArrayList<Contractor> contractors;
    private ArrayList<Comment> comments;
    private ArrayList<User> users;

    /**
     *
     * @return
     */
    public ArrayList<Manager> getManagers() {
        return managers;
    }

    /**
     *
     * @param managers
     */
    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    /**
     *
     * @return
     */
    public ArrayList<HouseKeeper> getHouseKeepers() {
        return houseKeepers;
    }

    /**
     *
     * @param houseKeepers
     */
    public void setHouseKeepers(ArrayList<HouseKeeper> houseKeepers) {
        this.houseKeepers = houseKeepers;
    }

    /**
     *
     * @return
     */
    public ArrayList<Contractor> getContractors() {
        return contractors;
    }

    /**
     *
     * @param contractors
     */
    public void setContractors(ArrayList<Contractor> contractors) {
        this.contractors = contractors;
    }

    /**
     *
     * @return
     */
    public ArrayList<Comment> getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     */
    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     *
     * @param users
     */
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    /**
     *
     * @param newRealEstate
     */
    public void addRealEstate(RealEstate newRealEstate) {
        realEstates.add(newRealEstate);
    }

    /**
     *
     * @param realEstateToRemove
     */
    public void removeRealEstate(RealEstate realEstateToRemove) {
        realEstates.removeIf(realEstate -> realEstate.equals(realEstateToRemove));
    }

    /**
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void saveRealEstates() throws FileNotFoundException, IOException{
        FileOutputStream f = new FileOutputStream("realestate.ser");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(realEstates);
        out.close();
        f.close();
        
    };

    /**
     *
     * @return realestates
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ArrayList<RealEstate> loadRealEstates() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fin = new FileInputStream("realestate.ser");
        ObjectInputStream in = new ObjectInputStream(fin);
        @SuppressWarnings("unchecked")
        ArrayList<RealEstate> realestates = (ArrayList<RealEstate>)in.readObject();
        in.close();
        fin.close();
        return realestates;    
    }

    /**
     *
     * @param realEstates
     * @param RealEstateType
     * @param minPrice
     * @param maxPrice
     * @param location
     * @return foundRealEstate
     * @throws RuntimeException
     */
    public RealEstate search(ArrayList<RealEstate> realEstates, String name, double minPrice, double maxPrice, String location) throws RuntimeException {
    RealEstate foundRealEstate = null;

    for (RealEstate realEstate : realEstates) {
        if (name != null && !name.equals(realEstate.getName())) {
            throw new RuntimeException("Invalid real estate type: " + name);
        }

        if (minPrice > realEstate.getPrice() || maxPrice < realEstate.getPrice()) {
            throw new RuntimeException("Invalid price range: [" + minPrice + ", " + maxPrice + "]");
        }

        if (location != null && !location.equals(realEstate.getLocation())) {
            throw new RuntimeException("Invalid location: " + location);
        }

        foundRealEstate = realEstate;
        break;
    }

    if (foundRealEstate == null) {
        throw new RuntimeException("Real estate not found");
    }

    return foundRealEstate;
}

    /**
     *
     * @param realestates
     * @return
     */
    public ArrayList<RealEstate> sortRealEstates(ArrayList<RealEstate> realestates) {
    Collections.sort(realestates, (RealEstate o1, RealEstate o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
    return realestates;
}

    /**
     *
     * @return
     */
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("Real Estates:").append(System.lineSeparator());
    for (RealEstate realEstate : realEstates) {
        sb.append(realEstate.toString()).append(System.lineSeparator());
    }

    sb.append("Managers:").append(System.lineSeparator());
    for (Manager manager : managers) {
        sb.append(manager.toString()).append(System.lineSeparator());
    }

    sb.append("House Keepers:").append(System.lineSeparator());
    for (HouseKeeper houseKeeper : houseKeepers) {
        sb.append(houseKeeper.toString()).append(System.lineSeparator());
    }

    sb.append("Contractors:").append(System.lineSeparator());
    for (Contractor contractor : contractors) {
        sb.append(contractor.toString()).append(System.lineSeparator());
    }

    sb.append("Comments:").append(System.lineSeparator());
    for (Comment comment : comments) {
        sb.append(comment.toString()).append(System.lineSeparator());
    }

    sb.append("Users:").append(System.lineSeparator());
    for (User user : users) {
        sb.append(user.toString()).append(System.lineSeparator());
    }

    return sb.toString();
}
}

