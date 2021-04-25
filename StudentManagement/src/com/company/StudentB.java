package com.company;

public class StudentB extends Student{
    public StudentB(){

    }

    public StudentB(String studentId, String fullName, String address, String area, String subjectFirst, String secondSubject, String thirdSubject) {
        super(studentId, fullName, address, area, subjectFirst, secondSubject, thirdSubject);
    }
    @Override
    public void displayStudentInfo(){
        System.out.printf("Khối B, ");
        super.displayStudentInfo();
    }
}
