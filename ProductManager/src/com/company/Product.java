package com.company;

import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private double price;
    static Scanner sc = new Scanner(System.in);
    public Product(){

    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void productInfo(){
        System.out.println("Nhập mã sản phẩm");
        id = sc.next();
        System.out.println("Nhập tên sản phẩm");
        name = sc.next();
        System.out.println("Nhập giá sản phẩm");
        price = sc.nextDouble();
    }
    public void displayProductInfo(){
        System.out.printf("Mã sản phẩm: %s, Tên sản phẩm: %s, Giá sản phẩm: %.1f\n",id,name,price);
    }


}
