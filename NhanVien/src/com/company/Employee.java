package com.company;

public class Employee {
    private String id;
    private String fullName;
    private int age;
    private double phoneNumber;
    private String email;
    private static int amount = 0;
    private static Employee employee[] = new Employee[200];
    public Employee(){

    }

    public Employee(String id, String fullName, int age, double phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void addEmployee(Employee employee){
        this.employee[amount] = employee;
        amount++;
    }

    public void displayEmployeeList(){
        for (int i = 0; i < amount; i++){
            System.out.println(employee[i]);
        }
        System.out.println();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void getLowPaidEmployee(){
        double avg = this.getTotalSalary()/amount;
        for (int i = 0; i < amount; i++) {
            if (employee[i] instanceof FullTimeEmployees) {
                if(((FullTimeEmployees) employee[i]).getSalary() < avg){
                    System.out.println(employee[i]);
                }
            }
        }
    }
    public double getTotalSalary(){
        double total = 0;
        for (int i = 0; i < amount; i++){
           if(employee[i] instanceof FullTimeEmployees){
               total += ((FullTimeEmployees) employee[i]).getSalary();
           } else if(employee[i] instanceof PartTimeEmployees){
               total += ((PartTimeEmployees) employee[i]).getSalary();
           }
        }
        return total;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", Age='" + age + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
