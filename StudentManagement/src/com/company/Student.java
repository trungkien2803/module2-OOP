package com.company;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String fullName;
    private String address;
    private String area;
    private double subjectFirst;
    private double secondSubject;
    private double thirdSubject;
    public Scanner sc = new Scanner(System.in);


    public Student(){

    }

    public Student(String studentId, String fullName, String address, String area) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.address = address;
        this.area = area;

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSubjectFirst() {
        return subjectFirst;
    }

    public void setSubjectFirst(double subjectFirst) {
        this.subjectFirst = subjectFirst;
    }

    public double getSecondSubject() {
        return secondSubject;
    }

    public void setSecondSubject(double secondSubject) {
        this.secondSubject = secondSubject;
    }

    public double getThirdSubject() {
        return thirdSubject;
    }

    public void setThirdSubject(double thirdSubject) {
        this.thirdSubject = thirdSubject;
    }

    public void studentInfo(){
        System.out.println("Số báo danh");
        studentId = sc.next();
        System.out.println("Họ và tên");
        fullName = sc.next();
        System.out.println("Địa chỉ");
        address = sc.next();
        System.out.println("Khu vực");
        area = sc.next();


    }
    public void displayStudentInfo(){
        System.out.printf("Số báo danh: %s, Họ và tên: %-10s, Địa chỉ: %s, Khu vực: %s, ", studentId,fullName,address,area);
    }
}
