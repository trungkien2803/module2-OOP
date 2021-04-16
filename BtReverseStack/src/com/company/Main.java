package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public void reverseArray(){
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = stack.pop();
            System.out.println(arr[i]);
        }
    }

    public static void reverseString(){
        String name = "abcxyz";
        String newName = "";
        String[] words = name.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < name.length(); i++){
            stack.push(words[i]);
        }
        for (int i = 0; i < name.length(); i++){
            newName += stack.pop();
        }
        System.out.println(newName);
    }
    public static void main(String[] args) {
        reverseString();
    }
}
