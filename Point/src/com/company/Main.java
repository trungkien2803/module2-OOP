package com.company;

public class Main {

    public static void main(String[] args) {
	    Point2d point2d = new Point2d(1,2);
	    point2d.setXY(5,6);
        for(float element : point2d.getXY()){
            System.out.println(element);
        }
    }
}
