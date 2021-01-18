package net.iqb.zaregistration.model.json;

public class PersonDetails {

    private String name;
    private String nationalID;
    private String phoneNumber;

    public PersonDetails(String name, String nationalID, String phoneNumber) {
        this.name = name;
        this.nationalID = nationalID;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
