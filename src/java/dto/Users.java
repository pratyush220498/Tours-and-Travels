/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author pratyush
 */
public class Users {
    private String name;
    private String id;
    private String gender;
    private String address;
    private String place;
    private String enquiry;

    public Users() {
    }

    public Users(String name, String id, String gender, String address, String place, String enquiry) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.address = address;
        this.place = place;
        this.enquiry = enquiry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(String enquiry) {
        this.enquiry = enquiry;
    }
    
    
}
