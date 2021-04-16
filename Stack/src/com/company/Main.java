package com.company;

public class Main {

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            try {
                System.out.printf(" %d", stack.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
