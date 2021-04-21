package com.company;

import java.util.Scanner;

public class Main {
    static void menu(){
        System.out.println("1.Thêm một giáo viên");
        System.out.println("2.Hiển thị danh sách giáo viên");
        System.out.println("3.Hiển thị danh sách giáo viên có lương hơn 8 triệu");
        System.out.println("0.Thoát");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OfficeresManagement officeresManagement = new OfficeresManagement();
        int choice = -1;
        do{
            menu();
            choice = sc.nextInt();
            switch (choice){
                case 1:{
                    Officers officers = new Officers();
                    officers.officersInfo();
                    officeresManagement.addOfficers(officers);
                    break;
                }
                case 2: {
                    officeresManagement.displayOfficersList();
                    break;
                }
                case 3: {
                    officeresManagement.showSalary();
                    break;
                }
            }
        }while (choice!=0);

    }
}
