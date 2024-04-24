package realestate;

public class Studio{
    private int studioID;
    private String studioType;
    public Studio(int id, String type){
        this.studioID=id;
        this.studioType=type;
    }
    public int getStudioID() {
        return studioID;
    }
    public void setStudioID(int studioID) {
        this.studioID = studioID;
    }
    public String getStudioType() {
        return studioType;
    }
    public void setStudioType(String studioType) {
        this.studioType = studioType;
    }
}
