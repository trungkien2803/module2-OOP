package com.company;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private String id;
    private String fullName;
    private String homeTown;
    private String ofClass;
    private double mark;

    public Student(){

    }

    public Student(String id, String fullName, String homeTown, String ofClass, double mark) {
        this.id = id;
        this.fullName = fullName;
        this.homeTown = homeTown;
        this.ofClass = ofClass;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getOfClass() {
        return ofClass;
    }

    public void setOfClass(String ofClass) {
        this.ofClass = ofClass;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    public void studentInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sinh viên");
        id = sc.next();
        System.out.println("Họ tên");
        fullName= sc.next();
        System.out.println("Quê quán");
        homeTown = sc.next();
        System.out.println("Lớp");
        ofClass = sc.next();
        System.out.println("Điểm");
        mark = sc.nextDouble();
    }
    public void displayStudentInfo(){
        System.out.printf("Mã sinh viên: %s, Họ tên: %s, Quê quán: %s, Lớp: %s, Điểm: %.1f\n",id,fullName,homeTown,ofClass,mark);
    }
}
