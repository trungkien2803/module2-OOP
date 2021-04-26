package com.company;

public class StudentC extends Student{
    private double literatureScore;
    private double historyScore;
    private double geographyScore;
    public StudentC(){

    }

    public StudentC(double literatureScore, double historyScore, double geographyScore) {
        this.literatureScore = literatureScore;
        this.historyScore = historyScore;
        this.geographyScore = geographyScore;
    }

    public StudentC(String studentId, String fullName, String address, String area, double literatureScore, double historyScore, double geographyScore) {
        super(studentId, fullName, address, area);
        this.literatureScore = literatureScore;
        this.historyScore = historyScore;
        this.geographyScore = geographyScore;
    }

    @Override
    public double getSubjectFirst() {
        return literatureScore;
    }
    @Override
    public void setSubjectFirst(double subjectFirst) {
        this.literatureScore = subjectFirst;
    }
    @Override
    public double getSecondSubject() {
        return historyScore;
    }
    @Override
    public void setSecondSubject(double secondSubject) {
        this.historyScore = secondSubject;
    }
    @Override
    public double getThirdSubject() {
        return geographyScore;
    }
    @Override
    public void setThirdSubject(double thirdSubject) {
        this.geographyScore = thirdSubject;
    }
    @Override
    public void studentInfo(){
        super.studentInfo();
        System.out.println("Nhập điểm Van");
        literatureScore = sc.nextDouble();
        System.out.println("Nhập điểm Sử");
        historyScore = sc.nextDouble();
        System.out.println("Nhập điểm Địa");
        geographyScore = sc.nextDouble();

    }

    public void displayStudentInfo(){
        System.out.printf("Khối C, ");
        super.displayStudentInfo();
        System.out.printf("Điểm Văn: %.1f, Điểm Sử: %.1f, Điểm Địa: %.1f\n", literatureScore,historyScore,geographyScore);
    }
}
