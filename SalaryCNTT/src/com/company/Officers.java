package com.company;

import java.util.Scanner;

public class Officers {
    public static final String HARD_SALARY = "Lương cứng";
    public static final String BONUS = "Tiền thương";
    public static final String FINE = "Tiền phạt";
    public static final String SALARY = "Lương thực tế";
    private double hardSalary;
    private double bonus;
    private double fine;
    private double salary;
    private OfficersTeacher officersTeacher = new OfficersTeacher();
    private Scanner sc = new Scanner(System.in);

    public Officers() {

    }

    public Officers(double hardSalary, double bonus, double fine, OfficersTeacher officersTeacher) {
        this.hardSalary = hardSalary;
        this.bonus = bonus;
        this.fine = fine;
        this.officersTeacher = officersTeacher;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double hardSalary, double bonus, double fine) {
        this.salary = hardSalary + bonus - fine;
    }

    public void officersInfo() {
        officersTeacher.officersTeacherInfo();
        System.out.println(HARD_SALARY);
        this.hardSalary = sc.nextDouble();
        System.out.println(BONUS);
        this.bonus = sc.nextDouble();
        System.out.println(FINE);
        this.fine = sc.nextDouble();
        this.salary = this.hardSalary + this.bonus - this.fine;
    }

    public void displayOfficersInfo() {
        officersTeacher.displayOfficersTeacherInfo();
        System.out.printf(HARD_SALARY + ": %.1f, " + BONUS + ": %.1f, " + FINE + ": %.1f, " + SALARY + ": %.1f\n", hardSalary, bonus, fine, salary);
    }
}
