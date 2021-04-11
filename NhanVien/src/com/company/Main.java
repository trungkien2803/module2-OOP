package com.company;

import java.util.Scanner;

public class Main {
    static void infoFullTimeEmployee() {
        System.out.println("Nhập id");
        String id = sc.next();
        System.out.println("Nhập họ và tên");
        String fullName = sc.next();
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();
        System.out.println("nhập số điện thoại");
        String phoneNumber = sc.next();
        System.out.println("Nhập email");
        String email = sc.next();
        System.out.println("Nhập tiền thưởng");
        double bonus = sc.nextDouble();
        System.out.println("Nhập tiền phạt");
        double fine = sc.nextDouble();
        System.out.println("Nhập lương cứng");
        double salary = sc.nextDouble();
        new FullTimeEmployees(id, fullName, age, phoneNumber, email, bonus, fine, salary);
    }

    static void infoPartTimeEmployee() {
        System.out.println("Nhập id");
        String id = sc.next();
        System.out.println("Nhập họ và tên");
        String fullName = sc.next();
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();
        System.out.println("nhập số điện thoại");
        String phoneNumber = sc.next();
        System.out.println("Nhập email");
        String email = sc.next();
        System.out.println("Nhập số giờ làm việc");
        double hoursWorked = sc.nextDouble();
        new PartTimeEmployees(id, fullName, age, phoneNumber, email, hoursWorked);
    }

    static void menu() {
        System.out.println("1. Thêm nhân viên Full Time");
        System.out.println("2. THêm nhân viên Part Time");
        System.out.println("3. Hiển thị danh sách nhân viên");
        System.out.println("4. Hiển thị tổng tiền lương phải trả cho nhiên viên part time");
        System.out.println("5. Hiển thị những nhân viên Full Time nhận lương thấp hơn mức trung bình");
        System.out.println("0. Exit");
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee = new Employee();
        PartTimeEmployees partTimeEmployees = new PartTimeEmployees();
        int choice;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    infoFullTimeEmployee();
                    break;
                }
                case 2: {
                    infoPartTimeEmployee();
                    break;
                }
                case 3: {
                    employee.displayEmployeeList();
                    break;
                }
                case 4: {
                    partTimeEmployees.getTotalSalaryPartTime();
                    break;
                }
                case 5: {
                    employee.getLowPaidEmployee();
                    break;
                }
            }
        } while (choice != 0);

    }
}
