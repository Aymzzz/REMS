package user;

public class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phone;
    
    // constructor 
    public User(int id, String name, int age, String email, String phone){
        this.id = id; 
        this.name = name;
        this.age = age; 
        this.email = email;
        this.phone = phone;
    }
    //getters and setters methods for existing attributes 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //methods
    public void viewProfile(){
        System.out.println("Name: ", +name);
        System.out.println("Age: ", + age);
        System.out.println("Email: ", +email);
        System.out.println("Phone: ", +Phone);
    }

    public void updateProfile(){
    }

    public void changeProfilePicture(){
    }

    public void deleteAccount(){
    }

    public void sendMessage(String message){
    }

    public void retrieveUserInfo(){
    }

    public List<RealEstate> browseProperties(){
        return realEstate; 
    }

    public void viewPropertyDetails(int propertyID){
    }

    public void bookmarkProperty(int propertyID){
    }

    public void contactOwner(int propertyID, String message){
    }

    public void addComment(Comment comment){
    }

}
