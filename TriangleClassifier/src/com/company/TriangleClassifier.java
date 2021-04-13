package com.company;

public class TriangleClassifier {
    public static boolean checkTriangle(double firstSideTriangle, double secondSideTriangle, double thirdSideTriangle) {
        return firstSideTriangle + secondSideTriangle > thirdSideTriangle &&
                firstSideTriangle + thirdSideTriangle > secondSideTriangle &&
                secondSideTriangle + thirdSideTriangle > firstSideTriangle;
    }

    public static boolean checkIsoscelesTriangle(double firstSideTriangle, double secondSideTriangle, double thirdSideTriangle) {
        return firstSideTriangle == secondSideTriangle ||
                firstSideTriangle == thirdSideTriangle ||
                thirdSideTriangle == secondSideTriangle;
    }

    public static boolean checkEquilateralTriangle(double firstSideTriangle, double secondSideTriangle, double thirdSideTriangle) {
        return firstSideTriangle == secondSideTriangle &&
                secondSideTriangle == thirdSideTriangle;
    }

    public static void triangularClassification(double firstSideTriangle, double secondSideTriangle, double thirdSideTriangle) {
        boolean triangularConditions = checkTriangle(firstSideTriangle, secondSideTriangle, thirdSideTriangle);
        boolean equilateralTriangleConditions = checkEquilateralTriangle(firstSideTriangle, secondSideTriangle, thirdSideTriangle);
        boolean isoscelesTriangleConditions = checkIsoscelesTriangle(firstSideTriangle, secondSideTriangle, thirdSideTriangle);
        if (triangularConditions) {
            if (equilateralTriangleConditions) {
                System.out.println("Tam giác đều");
            } else if (isoscelesTriangleConditions) {
                System.out.println("Tam giác cân");
            } else {
                System.out.println("Tam giác thường");
            }
        } else {
            System.out.println("Không phải tam giác");
        }
    }

    public static void main(String[] args) {
        triangularClassification(3,3,3);
    }
}
