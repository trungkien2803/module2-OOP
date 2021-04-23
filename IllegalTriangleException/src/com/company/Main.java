package com.company;

import java.util.Scanner;

public class Main {
    public static void drawTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1 || side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalTriangleException();
        } else {
            System.out.printf("3 cạnh tam giác");
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập cạnh 1");
        double side1 = sc.nextDouble();
        System.out.printf("Nhập cạnh 2");
        double side2 = sc.nextDouble();
        System.out.printf("Nhập cạnh 3");
        double side3 = sc.nextDouble();
        drawTriangle(side1, side2, side3);
    }
}
