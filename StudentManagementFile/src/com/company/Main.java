package com.company;

import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.printf("%-50s%s\n", "1. Thêm sinh viên", "6. Sắp xếp sinh viên theo điểm");
        System.out.printf("%-50s%s\n", "2. Hiển thị thông tin sinh viên", "7. Tìm sinh viên theo mã sinh viên");
        System.out.printf("%-50s%s\n", "3. Sửa thông tin sinh viên", "8. Thống kê sinh viên từng lớp");
        System.out.printf("%-50s%s\n", "4. Xóa thông tin sinh viên", "9. Sắp xếp theo mã sinh viên");
        System.out.printf("%-50s%s\n", "5. Hiển thị những sinh viên có điểm cao nhất", "0. Thoát");
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        String choice = "-1";

        do {
            menu();
            studentManagement.readDataFromFile();
            choice = sc.next();
            switch (choice) {
                case "1": {
                    studentManagement.addStudent();
                    break;
                }
                case "2": {
                    studentManagement.displayStudentList();
                    break;
                }
                case "3": {
                    studentManagement.editStudentInfo();
                    break;
                }
                case "4": {
                    studentManagement.deleteStudentInfo();
                    break;
                }
                case "5": {
                    studentManagement.markMax();
                    break;
                }
                case "6": {
                    studentManagement.sortMark();
                    break;
                }
                case "7": {
                    studentManagement.findId();
                    break;
                }
                case "8": {
                    studentManagement.statistical();
                    break;
                }
                case "9": {
                    studentManagement.sortID();
                    break;
                }
                case "0": {
                    System.err.println("Good bye");
                    break;
                }
                default: {
                    System.out.println("Không có sự lựa chọn này");
                    break;
                }
            }
        } while (!choice.equals("0"));
    }
}
