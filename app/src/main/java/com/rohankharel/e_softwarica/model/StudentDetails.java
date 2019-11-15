package com.rohankharel.e_softwarica.model;

public class StudentDetails {

    String name;
    String age;
    String address;
    String gender;
    int imageId;

    public StudentDetails(String name, String age, String address, String gender, int imageId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
