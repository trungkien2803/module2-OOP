package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.printf("%-30s%s\n", "1. Thêm sách", "5. Tìm theo thể loại");
        System.out.printf("%-30s%s\n", "2. Thêm tạp chí", "6. Sắp xếp");
        System.out.printf("%-30s%s\n", "3. Thêm báo", "7. Tìm theo id");
        System.out.printf("%-30s%s\n", "4. Hiển thị", "8. Sắp xếp theo id");
        System.out.printf("0. Thoát\n");

    }

    public static void main(String[] args) {
        LibararyManagement libararyManagement = new LibararyManagement();
        libararyManagement.addDocument(new Book("5","6",5,"8",40));
        libararyManagement.addDocument(new Book("2","1",71,"8",400));
        libararyManagement.addDocument(new Book("4","5",17,"8",45));
        libararyManagement.addDocument(new Journal("1","4",700,"8",54));
        libararyManagement.addDocument(new Journal("8","3",97,"8",84));
        libararyManagement.addDocument(new Journal("3","2",100,"8",74));

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
                case 2: {
                    Journal journal = new Journal();
                    journal.journalInfo();
                    libararyManagement.addDocument(journal);
                    break;
                }
                case 3: {
                    Newspaper newspaper = new Newspaper();
                    newspaper.newspaperInfo();
                    libararyManagement.addDocument(newspaper);
                    break;
                }
                case 4: {
                    libararyManagement.displayDocumentLists();
                    break;
                }
                case 5: {
                    libararyManagement.findDocument();
                    break;
                }
                case 6: {
                    libararyManagement.sort();
                    break;
                }
                case 7: {
                    System.out.println("Nhập id cần tìm");
                    String id = sc.next();
                    libararyManagement.findId(id);
                    break;
                }
                case 8: {
                    libararyManagement.sortId();
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
