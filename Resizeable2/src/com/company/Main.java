package com.company;

public class Main {

    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle.getArea());
//        circle.resize(1);
//        System.out.println(circle.getArea());
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getArea());
        for(int i = 0; i < 5;i++){
            System.out.println();
            for (int j = 0; j < 10; j++){
                System.out.printf(" * ");
            }
        }
        rectangle.resize(1);
        System.out.println(rectangle.getArea());
        for(int i = 0; i < rectangle.getWidth();i++){
            System.out.println();
            for (int j = 0; j < rectangle.getLength(); j++){
                System.out.printf(" * ");
            }
        }
    }
}
