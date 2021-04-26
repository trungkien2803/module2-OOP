package com.company;

public class StudentA extends Student{
    private double mathScore;
    private double physicalScore;
    private double chemicalScore;
    public StudentA(){

    }

    public StudentA(double mathScore, double physicalScore, double chemicalScore) {
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemicalScore = chemicalScore;
    }

    public StudentA(String studentId, String fullName, String address, String area, double mathScore, double physicalScore, double chemicalScore) {
        super(studentId, fullName, address, area);
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
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
        return physicalScore;
    }
    @Override
    public void setSecondSubject(double secondSubject) {
        this.physicalScore = secondSubject;
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
    public void studentInfo(){
        super.studentInfo();
        System.out.println("Nhập điểm toán");
        mathScore = sc.nextDouble();
        System.out.println("Nhập điểm lý");
        physicalScore = sc.nextDouble();
        System.out.println("Nhập điểm hóa");
        chemicalScore = sc.nextDouble();

    }
    @Override
    public void displayStudentInfo(){
        System.out.printf("Khối A, ");
        super.displayStudentInfo();
        System.out.printf("Điểm Toán: %.1f, Điểm Lý: %.1f, Điểm sinh: %.1f\n", mathScore,physicalScore,chemicalScore);
    }
}
