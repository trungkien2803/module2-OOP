package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = src.nextLine();
        LinkedList<Character> charList = new LinkedList<>();
        for(int i = 0; i < str.length(); i++){
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(str.charAt(i));
            for(int j = i+1; j < str.length(); j++){
                if(str.charAt(j) > tempList.getLast()){
                    tempList.add(str.charAt(j));    
                }
            }
            if(charList.size() < tempList.size()){
                charList.clear();
                charList.addAll(tempList);
            }
            tempList.clear();
        }

        for (Character character : charList){
            System.out.print(character);
        }
    }
}
