package com.company;

import java.util.Arrays;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        String fullName = "dsf Tran abc Trung Kien abc Tran Trung Kien Tran Trung Kien abc ghf";
        String words[] = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], 0);
        }
        for (int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i])){
                map.replace(words[i], map.get(words[i])+1);
            }
        }
        System.out.println(map);
    }
}