package realestate;

public class Apartment{
    private static String ApartmentName = null;
    private int apartmentID;
    public Apartment(int id){
        this.apartmentID=id;
    }
    
    /** 
     * @return int
     */
    public int getApartmentID() {
        return apartmentID;
    }
    public void setApartmentID(int apartmentID) {
        this.apartmentID = apartmentID;
    }
    public String getApartmentName() {
        return ApartmentName;
    }
    public void setApartmentName(String apartmentName) {
        ApartmentName = apartmentName;
    }
}
