package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void menu(){
        System.out.println("1. Thêm sách");
        System.out.println("2. Thêm tạp chí");
        System.out.println("3. Thêm báo");
        System.out.println("4. Hiển thị");
        System.out.println("5. Tìm theo thể loại");
        System.out.println("6. Sắp xếp");
        System.out.println("7. Tìm theo id");
        System.out.println("0. Thoát");

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
