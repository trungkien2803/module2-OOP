package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void menu(){
        System.out.println("1.Thêm sản phẩm");
        System.out.println("2.Xóa sản phẩm");
        System.out.println("3.Sửa sản phẩm");
        System.out.println("4.Tìm sản phẩm");
        System.out.println("5.Hiển thị sản phẩm");
        System.out.println("6.Sắp xếp sản phẩm");
        System.out.println("0.exit");
    }
    public static void main(String[] args) {
        ProductManager productManager =new ProductManager();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice){
                case 1: {
                    Product product = new Product();
                    product.productInfo();
                    productManager.addProduct(product);
                    break;
                }
                case 2: {
                    System.out.println("Nhập id");
                    String id = sc.next();
                    productManager.deleteProduct(id);
                    break;
                }
                case 3:{
                    System.out.println("Nhập id");
                    String id = sc.next();
                    productManager.editProduct(id);
                    break;
                }
                case 4:{
                    System.out.println("Nhập tên sản phẩm");
                    String name = sc.next();
                    productManager.findProduct(name);
                    break;
                }
                case 5:{
                    productManager.displayProducts();
                    break;
                }
                case 6:{
                    Collections.sort(productManager.getListProducts(),productManager);
                    break;
                }
            }
        }while (choice != 0);

    }
}
