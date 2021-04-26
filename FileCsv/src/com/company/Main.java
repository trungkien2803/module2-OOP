package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception{
        List<String> list = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("text"));
        String line = "";
        while ((line = fileReader.readLine()) != null){
            System.out.println(line);
            String arr [] = line.split(",");
            list.add(arr[arr.length-1]);
        }
        for (String list1 : list){
            System.out.println(list1);
        }
        fileReader.close();
    }
}
