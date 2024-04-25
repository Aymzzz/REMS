package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import realestate.Comment;
import realestate.RealEstate;

public class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phone;
    private List<RealEstate> realEstates = new ArrayList<>(); //  it is a list to store real estate listings
    private List<Integer> bookmarkedProperties = new ArrayList<>(); // List to store property IDs
    private List<Integer> likedProperties = new ArrayList<>();// list to strore liked property IDs
    private List<Integer> dislikedProperties = new ArrayList<>();// List to store disliked property IDs
    
    // constructor 
    public User(int id, String name, int age, String email, String phone2){
        this.id = id; 
        this.name = name;
        this.age = age; 
        this.email = email;
        this.phone = phone2;
    }
    

    /** 
     * @return int
     */
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
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

   public void updateProfile(String newName, int newAge, String newEmail, String newPhone) {
        setName(newName);
        setAge(newAge);
        setEmail(newEmail);
        setPhone(newPhone);
        System.out.println("Profile has been updated.");
    }
    public void updateName() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the new name: ");
            String newName = scanner.nextLine();
            setName(newName);
            System.out.println("Name updated successfully to: " + newName);
        }
    }
    public void updateAge() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the new age: ");
            int newAge = scanner.nextInt();
            scanner.nextLine(); // Consume newline left after nextInt()
            // Update the age
            setAge(newAge);
            System.out.println("Age updated successfully to: " + newAge);
        }
    }

    public void updateEmail() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the new email: ");
            String newEmail = scanner.nextLine();
            setEmail(newEmail);
            System.out.println("Email updated successfully to: " + newEmail);
        }
    }
    
     public void updatePhoneNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            setPhone(newPhoneNumber);
            System.out.println("Phone number updated successfully to: " + newPhoneNumber);
        }
    }

    public void deleteAccount(){
        System.out.println("Account deleted.");
    }

    public void sendMessage(String message){
    }

    public void retrieveUserInfo(){
        viewProfile();
    }

    public List<RealEstate> browseProperties(){
        return realEstates; 
    }

    public void viewPropertyDetails(int propertyID) {
        RealEstate property = realEstates.stream()
            .filter(realEstate -> realEstate.getId() == propertyID)
            .findFirst()
            .orElse(null);
        
        if (property != null) {
            System.out.println("Property Details: " + property.toString());
        } else {
            System.out.println("Property not found.");
        }
    }

    public void bookmarkProperty(int propertyID) {
        if (!bookmarkedProperties.contains(propertyID)) {
            bookmarkedProperties.add(propertyID);
            System.out.println("Property bookmarked.");
        } else {
            System.out.println("Property already bookmarked.");
        }
    }

   public void contactOwner(int propertyID, String message) {
        System.out.println("Message to owner of property ID " + propertyID + ": " + message);
    }


     public void addComment(Comment comment) {
      
        RealEstate property = realEstates.stream()
            .filter(realEstate -> realEstate.getId() == comment.getPropertyID())
            .findFirst()
            .orElse(null);
        
        if (property != null) {
            property.addComment(comment);
            System.out.println("Comment added: " + comment.getText());
        } else {
            System.out.println("Property not found, cannot add comment.");
        }
    }

     public void likeProperty(int propertyID) {
        if (!likedProperties.contains(propertyID) && !dislikedProperties.contains(propertyID)) {
            likedProperties.add(propertyID);
            System.out.println("Property ID " + propertyID + " added to liked properties.");
        } else {
            System.out.println("You have already liked or disliked property ID " + propertyID + ".");
        }
    }

    public void dislikeProperty(int propertyID) {
        if (!dislikedProperties.contains(propertyID) && !likedProperties.contains(propertyID)) {
            dislikedProperties.add(propertyID);
            System.out.println("Property ID " + propertyID + " added to disliked properties.");
        } else {
            System.out.println("You have already liked or disliked property ID " + propertyID + ".");
        }
    }

    public void viewLikedProperties() {
        if (likedProperties.isEmpty()) {
            System.out.println("You have not liked any properties yet.");
        } else {
            System.out.println("Liked Properties:");
            for (int propertyID : likedProperties) {
                System.out.println("- Property ID: " + propertyID);
            }
        }
    }

    public void viewDislikedProperties() {
        if (dislikedProperties.isEmpty()) {
            System.out.println("You have not disliked any properties yet.");
        } else {
            System.out.println("Disliked Properties:");
            for (int propertyID : dislikedProperties) {
                System.out.println("- Property ID: " + propertyID);
            }
        }
    }
}
