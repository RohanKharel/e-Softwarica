package com.rohankharel.e_softwarica.model;

public class AddStudents {

    static  String name;
    static String age;
    static String address;
    static String gender;
    static int imageId;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AddStudents.name = name;
    }

    public static String getAge() {
        return age;
    }

    public static void setAge(String age) {
        AddStudents.age = age;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        AddStudents.gender = gender;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        AddStudents.address = address;
    }

    public static int getImageId() {
        return imageId;
    }

    public static void setImageId(int imageId) {
        AddStudents.imageId = imageId;
    }
}
