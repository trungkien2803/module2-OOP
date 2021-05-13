package com.company;

import java.awt.*;
import java.io.Serializable;

public class Phonebook implements Serializable {

    private String phoneNumber;
    private String contactGroup;
    private String name;
    private String gender;
    private String address;
    private String birthDate;
    private String email;

    public Phonebook() {
    }

    public Phonebook(String phoneNumber, String contactGroup, String name, String gender, String address, String birthDate, String email) {
        this.phoneNumber = phoneNumber;
        this.contactGroup = contactGroup;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthDate = birthDate;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", contactGroup='" + contactGroup + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
