package com.company;

public class StudentA extends Student{
    public StudentA(){

    }

    public StudentA(String studentId, String fullName, String address, String area, String subjectFirst, String secondSubject, String thirdSubject) {
        super(studentId, fullName, address, area, subjectFirst, secondSubject, thirdSubject);
    }
    @Override
    public void displayStudentInfo(){
        System.out.printf("Khối A, ");
        super.displayStudentInfo();
    }
}
