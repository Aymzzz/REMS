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
    private static ArrayList<RealEstate> realEstates;
    private static ArrayList<Manager> managers;
    private static ArrayList<HouseKeeper> houseKeepers;
    private static ArrayList<Contractor> contractors;
    private static ArrayList<Comment> comments;
    private static ArrayList<User> users;

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
    public static void addRealEstate(RealEstate newRealEstate) {
        realEstates.add(newRealEstate);
        System.out.println("New real estate added successfully!");
    }

    /**
     *
     * @param realEstateToRemove
     */
    public static void removeRealEstate(RealEstate realEstateToRemove) {
        boolean t = realEstates.removeIf(realEstate -> realEstate.equals(realEstateToRemove));
        
       if(t == true) System.out.println("Real estate removed successfully!");
       else System.out.println("No corresponding real estate property was found");
    }

    /**
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void saveRealEstates() throws FileNotFoundException, IOException{
        FileOutputStream f = new FileOutputStream("realestates.ser");
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
        FileInputStream fin = new FileInputStream("realestates.ser");
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
     * @param name
     * @param minPrice
     * @param maxPrice
     * @param location
     * @return foundRealEstate
     * @throws RuntimeException
     */
    public static ArrayList<RealEstate> search(ArrayList<RealEstate> realEstates, String name, double minPrice, double maxPrice, String location) throws RuntimeException {
    ArrayList<RealEstate> foundRealEstates = null;

    for (RealEstate realEstate : realEstates) {
        if(realEstate.getName().contains(name)){
            foundRealEstates.add(realEstate);
        } 
        if(realEstate.getPrice()<= maxPrice && realEstate.getPrice()>= minPrice){
            if(maxPrice == 0){maxPrice = 1000000000;}
            foundRealEstates.add(realEstate);
        }
        if(realEstate.getLocation().contains(location)){
            foundRealEstates.add(realEstate);
        }
        
    }
    if(name.equals("0") && location.equals("0") && minPrice == 0 && maxPrice == 0){
        foundRealEstates = realEstates;
    }

    if (foundRealEstates == null) {
        throw new RuntimeException("No corresponding real estates found!");
    }
    return foundRealEstates;
}
    public static void displayRealEstates(ArrayList<RealEstate> realestates){
        for (RealEstate e: realestates){
            System.out.println(e.toString());
        }
    }
    /**
     *
     * @param realestates
     * @return
     */
    public static ArrayList<RealEstate> sortRealEstates(ArrayList<RealEstate> realestates) {
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


