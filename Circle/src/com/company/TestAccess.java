package com.company;

public class TestAccess {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Bán kính " + circle.getRadius());
        System.out.println("Diện tích " + circle.getArea());
    }
}
