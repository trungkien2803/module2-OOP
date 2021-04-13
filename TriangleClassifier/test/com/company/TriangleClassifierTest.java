package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void checkTriangle() {
        double firstSideTriangle = 3;
        double secondSideTriangle = 4;
        double thirdSideTriangle = 5;
        boolean expected = true;
        boolean result = TriangleClassifier.checkTriangle(firstSideTriangle,secondSideTriangle,thirdSideTriangle);
        assertEquals(expected,result);
    }


    @Test
    void checkIsoscelesTriangle() {
        double firstSideTriangle = 3;
        double secondSideTriangle = 3;
        double thirdSideTriangle = 5;
        boolean expected = true;
        boolean result = TriangleClassifier.checkIsoscelesTriangle(firstSideTriangle,secondSideTriangle,thirdSideTriangle);
        assertEquals(expected,result);
    }

    @Test
    void checkEquilateralTriangle() {
        double firstSideTriangle = 3;
        double secondSideTriangle = 3;
        double thirdSideTriangle = 3;
        boolean expected = true;
        boolean result = TriangleClassifier.checkEquilateralTriangle(firstSideTriangle,secondSideTriangle,thirdSideTriangle);
        assertEquals(expected,result);
    }
}

