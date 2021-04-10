package com.company;

public class PartTimeEmployees extends Employee{
    private double hoursWorked;

    public PartTimeEmployees(){
    }

    public PartTimeEmployees(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public PartTimeEmployees(String id, String fullName, int age, double phoneNumber, String email, double hoursWorked) {
        super(id, fullName, age, phoneNumber, email);
        this.hoursWorked = hoursWorked;
        Employee employee = new Employee();
        employee.addEmployee(this);
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getSalary(){
        return getHoursWorked()*100000;
    }
    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", Age='" + getAge() + '\'' +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
