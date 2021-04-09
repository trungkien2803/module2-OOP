package com.company;

import java.util.Scanner;

public class Main {
//    Tính tổng giá
    static void totalPrice(Book books[]) {
        double total = 0;
        for (Book element : books) {
            total += element.getPrice();
        }
        System.out.println("Total = " + total);
    }
// Tìm sách ngôn ngữ Jav
    static double getLanguageJava(Book books[]) {
        int count = 0;
        for (Book element : books) {
            if (element instanceof ProgrammingBook) {
                if (((ProgrammingBook) element).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        return count;
    }

//    Sắp xếp giá tăng dần
    static void sort(Book books[]) {
        for (int i = 0; i < books.length; i++) {
            for (int j = i + i; j < books.length; j++) {
                if (books[i].getPrice() > books[j].getPrice()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
//    In
    static void displayList(Book books[]) {
        for (Book element : books) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Book books[] = new Book[10];
        for (int i = 0; i < books.length; i++) {
//            Tạo giá ngẫu nhiên
            double random = Math.floor(Math.random() * 1000000);
            if (i >= 5) {
                books[i] = new FictionBook(i, "Codegym" + i, random, "Kiên" + i, "Code" + i);
                continue;
            }
            books[i] = new ProgrammingBook(i, "Codegym" + i, random, "Kiên" + i, "Java", "ABC");
        }

        displayList(books);
        sort(books);
    }
}
