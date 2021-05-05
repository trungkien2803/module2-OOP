package com.company;

public class Main {

    public static void main(String[] args) {
	    ShapeFactory shapeFactory = new ShapeFactory();
	    shapeFactory.getShape("Circle").draw();

    }
}
