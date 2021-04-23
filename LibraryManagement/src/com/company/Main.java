package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void menu(){
        System.out.printf("%-30s%s\n","1. Thêm sách" , "4. Hiển thị");
        System.out.printf("%-30s%s\n","2. Thêm tạp chí" , "5. Tìm theo thể loại");
        System.out.printf("%-30s%s\n","3. Thêm báo" , "6. Sắp xếp");
        System.out.printf("%-30s%s\n","0. Thoát" , "7. Tìm theo id");

    }
    public static void main(String[] args) {
        LibararyManagement libararyManagement = new LibararyManagement();
        int choice = -1;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    Book book = new Book();
                    book.bookInfo();
                    libararyManagement.addDocument(book);
                    break;
                }
                case 2:{
                    Journal journal = new Journal();
                    journal.journalInfo();
                    libararyManagement.addDocument(journal);
                    break;
                }
                case 3: {
                    Newspaper newspaper =new Newspaper();
                    newspaper.newspaperInfo();
                    libararyManagement.addDocument(newspaper);
                    break;
                }
                case 4:{
                    libararyManagement.displayDocumentLists();
                    break;
                }
                case 5: {
                    libararyManagement.findDocument();
                    break;
                }
                case 6:{
                    libararyManagement.sort();
                    break;
                }
                case 7: {
                    System.out.println("Nhập id cần tìm");
                    String id = sc.next();
                    libararyManagement.findId(id);
                    break;
                }
            }
        } while (choice != 0);
    }
}
