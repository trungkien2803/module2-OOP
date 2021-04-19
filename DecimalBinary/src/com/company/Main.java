package com.company;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int num = 45;
        Stack stack = new Stack();
        while (num > 0) {

            stack.push(num % 2);
            num = num / 2;

        }
        String result = "";
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            result += stack.pop();
        }
        System.out.println(result);
    }
}
