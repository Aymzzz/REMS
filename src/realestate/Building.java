package realestate;

public class Building{
    private Apartment[] apartments;
    private Studio[] studios;
    private int numberApts;
    private int numberStudios;
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
}