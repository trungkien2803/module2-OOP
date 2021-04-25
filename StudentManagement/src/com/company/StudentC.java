package com.company;

public class StudentC extends Student{
    public StudentC(){

    }

    public StudentC(String studentId, String fullName, String address, String area, String subjectFirst, String secondSubject, String thirdSubject) {
        super(studentId, fullName, address, area, subjectFirst, secondSubject, thirdSubject);
    }

    public void displayStudentInfo(){
        System.out.printf("Khối C, ");
        super.displayStudentInfo();
    }
}
