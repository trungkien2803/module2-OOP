package com.company;

public class Main {

    public static void main(String[] args) {
	    Shape shape[] = new Shape[5];
	    shape[0] = new Square();
	    shape[1] = new Circle();
	    shape[2] = new Rectangle();
	    shape[3] = new Circle();
	    shape[4] = new Square();
	    for (Shape shape1 : shape){
	        if(shape1 instanceof Colorable){
	            ((Colorable) shape1).howToColor();
            }
        }
    }
}
