package realestate;

public class Building{
    private Apartment[] apartments;
    private Studio[] studios;
    private int numberApts;
    private int numberStudios;
    private String location;
    // constructor for Building class
    public Building(Apartment[] apartments, Studio[] studios, int numberApts, int numberStudios, String location) {
        this.apartments = apartments;
        this.studios = studios;
        this.numberApts = numberApts;
        this.numberStudios = numberStudios;
        this.location = location;
    }
    
    /** 
     * @return Apartment[]
     */
    public Apartment[] getApartments() {
        return apartments;
    }
    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }
    public Studio[] getStudios() {
        return studios;
    }
    public void setStudios(Studio[] studios) {
        this.studios = studios;
    }
    public int getNumberApts() {
        return numberApts;
    }
    public void setNumberApts(int numberApts) {
        this.numberApts = numberApts;
    }
    public int getNumberStudios() {
        return numberStudios;
    }
    public void setNumberStudios(int numberStudios) {
        this.numberStudios = numberStudios;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }
}
