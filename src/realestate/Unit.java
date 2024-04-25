package realestate;

/**
 *
 * @author Badr
 */
public class Unit {
    private String name;
    private int id;
    private UnitType unit_type;
    
    public Unit(String name, int id, UnitType unittype){
        this.name=name;
        this.id=id;
        this.unit_type=unittype;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the unit_type
     */
    public UnitType getUnit_type() {
        return unit_type;
    }

    /**
     * @param unit_type the unit_type to set
     */
    public void setUnit_type(UnitType unit_type) {
        this.unit_type = unit_type;
    }
}
