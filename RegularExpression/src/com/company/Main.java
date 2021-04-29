package com.company;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String string = sc.next();
        String regex = "^[CAP]\\d{4,}[G,H,I,K,L,M]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            System.out.println("OK");
        } else {
            System.out.println("Nhập lại");
        }
    }
}
