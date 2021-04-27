package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();
        int choice = -1;
        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phầm");
            System.out.println("3. Tìm sản phẩm");
            System.out.println("0. Thoát");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    Product product = new Product();
                    product.productInfo();
                    productManagement.addProduct(product);
                    break;
                case 2:
                    writeToFile("student.txt",productManagement.getList());
                    List<Product> products = readDataFromFile("student.txt");
                    for (Product product1: products){
                        System.out.println(product1);
                    }

                    break;
                case 3:
                    System.out.println("Nhập mã sản phầm");
                    String id = sc.next();
                    productManagement.findProduct(id);
                    break;
            }
        }while (choice != 0);
        writeToFile("student.txt", productManagement.getList());
        List<Product> studentDataFromFile = readDataFromFile("student.txt");
        for (Product student : studentDataFromFile) {
            System.out.println(student);
        }
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
}
