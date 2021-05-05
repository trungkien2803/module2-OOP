package com.company;

public class ShapeFactory {
    private Shape shape = null;
    public Shape getShape(String type) {
        switch (type) {
            case "Circle": {
                return new Circle();
            }

            case "Square": {
                return new Square();
            }

            case "Rectangle": {
                return new Rectangle();
            }
            default: {
                System.out.println("Nhập sai");
                return shape;
            }
        }
    }
}
