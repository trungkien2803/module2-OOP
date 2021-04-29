package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String regex ="^\\(\\d{2}\\)-\\(\\d{9,10}\\)$";
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()){
            System.out.println("ok");
        } else {
            System.out.println("Nhập lại");
        }
    }
}
