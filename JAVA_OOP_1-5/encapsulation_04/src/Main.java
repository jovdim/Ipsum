/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jovdim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // though it is encapsulated we can instatiate it and add value in it using constructors.
        User user = new User(2614, "lorem", "ipsum", "dolor");
        
        //we reaassign it using setters.
        user.setIserID(8952);
        
        System.out.println(user.getUserID());
        System.out.println(user.getUserName());
        System.out.println(user.getUserLastName());

    }

}

class User {

    //so if it is private we cannot access it directly. so it is ECAPSULATED. even though it is private we can access it but only to this class.
    private int userID;
    private String userName;
    private String firstName, lastName;

    User(int UserID, String userName, String firstName, String lastName) {
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //this is setters
    //this is the way to reaassign value to a private attributes. 
    void setIserID(int userID) {

        this.userID = userID;
    }

    //this is getters
    //this is the only way to get the value of the private/encapsulated attributes.
    int getUserID() {
        return this.userID;
    }

    //setters for userName
    void setUserName(String userName) {
        this.userName = userName;
    }

    //getters for userName;
    String getUserName() {
        return this.userName;
    }

    //setters for lastName
    void setUserLastName(String lastName) {
        this.lastName = lastName;
    }

    //getters for lastName
    String getUserLastName() {
        return this.lastName;
    }

}
