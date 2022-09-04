package com.sush.javapractice.objects;

public class UserSO {

    private String userName;

    private String firstName;

    private String lastName;

    private String address;

    // default constructor for creating user  object
    // default constructor is mandatory if you want to crete argument constructor
    public UserSO(){

    }

    // Argument constructor for creating user object with arguments
    public UserSO(String userName, String firstName, String lastName, String address) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Argument constructor for creating user object with arguments
    public UserSO(String userName, String firstName, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Argument constructor for creating user object with arguments
    public UserSO(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
