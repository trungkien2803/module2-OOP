package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.printf("%-30s%s\n", "1. Thêm sinh viên khối A", "5. Xóa sinh viên theo số báo danh");
        System.out.printf("%-30s%s\n", "2. Thêm sinh viên khối B", "6. Sắp xếp theo số báo danh");
        System.out.printf("%-30s%s\n", "3. Thêm sinh viên khối C", "7. Sắp xếp theo tên");
        System.out.printf("%-30s%s\n", "4. Hiển thị", "8. Tìm sinh viên theo số báo danh");
        System.out.printf("%-30s%s\n","0. Thoát", "9. Sửa thông tin");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admissions admissions = new Admissions();
	    StudentA studentA4 = new StudentA("2","Kien","3","4",10,10,10);
        StudentB studentB4 = new StudentB("8","Tuan","3","4",10,10,10);
        StudentC studentC4 = new StudentC("9","Thanh","3","4",10,10,10);
        StudentC studentC2 = new StudentC("5","Quan","3","4",10,10,10);
        StudentB studentB2 = new StudentB("6","Cuong","3","4",10,10,10);
        StudentA studentA2 = new StudentA("3","Vu","3","4",10,10,10);
        StudentC studentC3 = new StudentC("1","Tu","3","4",10,10,10);
        StudentB studentB3 = new StudentB("4","Hiep","3","4",10,10,10);
        StudentA studentA3 = new StudentA("7","Long","3","4",10,10,10);
	    admissions.addStudent(studentA4);
        admissions.addStudent(studentB4);
        admissions.addStudent(studentC4);
        admissions.addStudent(studentC2);
        admissions.addStudent(studentB2);
        admissions.addStudent(studentA2);
        admissions.addStudent(studentC3);
        admissions.addStudent(studentB3);
        admissions.addStudent(studentA3);

        int choice = -1;

        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    StudentA studentA = new StudentA();
                    studentA.studentInfo();
                    admissions.addStudent(studentA);
                    break;
                }
                case 2: {
                    StudentB studentB = new StudentB();
                    studentB.studentInfo();
                    admissions.addStudent(studentB);
                    break;
                }
                case 3: {
                    StudentC studentC = new StudentC();
                    studentC.studentInfo();
                    admissions.addStudent(studentC);
                    break;
                }
                case 4: {
                    admissions.displayStudentList();
                    break;
                }
                case 5: {
                    System.out.println("Nhập số báo danh cần xóa");
                    String id = sc.next();
                    admissions.delete(id);
                    break;
                }
                case 6: {
                    admissions.sortId();
                    break;
                }
                case 7: {
                    admissions.sortName();
                    break;
                }
                case 8: {
                    System.out.println("Nhập số báo danh cần tìm");
                    String id = sc.next();
                    admissions.findId(id);
                    break;
                }
                case 9:{
                    System.out.println("Nhập số báo danh cần sửa");
                    String id = sc.next();
                    admissions.editInfo(id);
                    break;
                }
                default: {
                    System.out.printf("Không có sự lựa chọn này");
                    break;
                }
            }
        } while (choice != 0);
    }

}
