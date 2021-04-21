package com.company;

import java.util.Scanner;

public class OfficersTeacher {
    public static final String FULL_NAME = "Họ và tên";
    public static final String BIRTH_DATE = "Ngày sinh";
    public static final String HOME_TOWN = "Quê quán";
    private String fullName;
    private String birthDate;
    private String homeTown;
    private Scanner sc = new Scanner(System.in);

    public OfficersTeacher() {

    }

    public OfficersTeacher(String fullName, String birthDate, String homeTown) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.homeTown = homeTown;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void officersTeacherInfo() {
        System.out.println(FULL_NAME);
        this.fullName = sc.next();
        System.out.println(BIRTH_DATE);
        this.birthDate = sc.next();
        System.out.println(HOME_TOWN);
        this.homeTown = sc.next();
    }

    public void displayOfficersTeacherInfo() {
        System.out.printf(FULL_NAME + ": %s, " + BIRTH_DATE + ": %s, " + HOME_TOWN + ": %s, ", fullName, birthDate, homeTown);
    }
}
