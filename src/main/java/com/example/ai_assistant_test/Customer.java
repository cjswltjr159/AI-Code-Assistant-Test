package com.example.ai_assistant_test;

public class Customer {
    // define fields for customer id, name, address, phone number, email
    private int customerID;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    // define constructor for customer
    public Customer(int customerID, String name, String address, String phoneNumber, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    // define getters and setters for customer fields
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // get and set for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // get and set for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // get and set for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // add a function to validate email
    public boolean validateEmail(String email) {
        // check if email is valid
        if (email.contains("@")) {
            return true;
        }
        return false;
    }
}