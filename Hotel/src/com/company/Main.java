package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số khách trọ");
        int n = scanner.nextInt();
        Room[] rooms = new Room[n];
        RoomManagement roomManagement = new RoomManagement(rooms);
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Nhập thông tin
                    roomManagement.inputRooms();
                    break;
                case 2:
                    //Hiển thị thông tin
                    roomManagement.showRooms();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Nhập CMT cần xóa:");
                    String id = scanner.nextLine();
                    roomManagement.deleteCustomer(id);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Nhập CMT cần tính tiền:");
                    id = scanner.nextLine();
                    roomManagement.totalMoneyForPayment(id);
                    break;
                case 5:
                    Room room = new Room();
                    room.inputRoomInfo();
                    roomManagement.addNewRoom(room);
                    break;
            }
        } while (choice != 0);
    }

    private static void menu() {
        System.out.println("1. Nhập thông tin khách trọ");
        System.out.println("2. Hiển thị thông tin khách trọ");
        System.out.println("3. Xóa thông tin khách trọ");
        System.out.println("4. Tính tiền cần thanh toán");
        System.out.println("5. Thêm thông tin khách trọ");
        System.out.println("0. Thoát");
    }
}
