package com.example.phonebookui;

public class Contact {
    //data members used for each contact
    private String userName;
    private String contactNumber;
    private int imageID;

    //initializing the data members using a constructor
    public Contact(String username, String contactNumber, int imageID)
    {
        this.userName = username;
        this.contactNumber = contactNumber;
        this.imageID = imageID;
    }

    //generated setters and getters for data members
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
