package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        double arr[] = {1000000,200000,100000,500000};
        double arr2[] = {2000000,1000000,500000,200000};
        for (int i = 0; i < 20; i++) {
            if (i > 15) {
                Employee partTimeEmployee = new PartTimeEmployees(""+i, "Kien"+i, 21+i, 941136887+i, "@gmail.com", 100);
                continue;
            }
            Employee fullTimeEmployee = new FullTimeEmployees(""+i, "Kien"+i, 21+i, 941136887+i, "@gmail.com",arr2[(int) Math.floor(Math.random()*4)], arr[(int) Math.floor(Math.random()*4)], 9000000);
        }
        employee.displayEmployeeList();
        System.out.printf("Tổng lương phải trả = " + employee.getTotalSalary()/20);
        employee.getLowPaidEmployee();
    }


}
