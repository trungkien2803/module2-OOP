package com.company;

public class StudentB extends Student{
    private double mathScore;
    private double biologyScore;
    private double chemicalScore;
    public StudentB(){

    }

    public StudentB(double mathScore, double biologyScore, double chemicalScore) {
        this.mathScore = mathScore;
        this.biologyScore = biologyScore;
        this.chemicalScore = chemicalScore;
    }

    public StudentB(String studentId, String fullName, String address, String area, double mathScore, double biologyScore, double chemicalScore) {
        super(studentId, fullName, address, area);
        this.mathScore = mathScore;
        this.biologyScore = biologyScore;
        this.chemicalScore = chemicalScore;
    }

    @Override
    public double getSubjectFirst() {
        return mathScore;
    }
    @Override
    public void setSubjectFirst(double subjectFirst) {
        this.mathScore = subjectFirst;
    }
    @Override
    public double getSecondSubject() {
        return biologyScore;
    }
    @Override
    public void setSecondSubject(double secondSubject) {
        this.biologyScore = secondSubject;
    }
    @Override
    public double getThirdSubject() {
        return chemicalScore;
    }
    @Override
    public void setThirdSubject(double thirdSubject) {
        this.chemicalScore = thirdSubject;
    }

    @Override
    public void displayStudentInfo(){
        System.out.printf("Khối B, ");
        super.displayStudentInfo();
        System.out.printf("Điểm Toán: %.1f, Điểm Sinh: %.1f, Điểm sinh: %.1f\n", mathScore,biologyScore,chemicalScore);
    }
}
