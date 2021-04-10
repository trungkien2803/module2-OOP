package com.company;

public class FullTimeEmployees extends Employee {
    private double bonus;
    private double fine;
    private double HardSalary;

    public FullTimeEmployees() {

    }

    public FullTimeEmployees(double bonus, double fine, double hardSalary) {
        this.bonus = bonus;
        this.fine = fine;
        this.HardSalary = hardSalary;
    }

    public FullTimeEmployees(String id, String fullName, int age, double phoneNumber, String email, double bonus, double fine, double hardSalary) {
        super(id, fullName, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.HardSalary = hardSalary;
        Employee employee = new Employee();
        employee.addEmployee(this);
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

    public double getHardSalary() {
        return HardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.HardSalary = hardSalary;
    }
    public double getSalary(){
        double salary = getHardSalary()+getBonus()-getFine();
        return salary;
    }
    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", Age='" + getAge() + '\'' +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", salary='" + getSalary() + '\'' +
                '}';
    }
}
