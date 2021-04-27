package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static String strings;

    public static void main(String[] args) {
        readFile();
        writeFile();
    }

    private static void writeFile() {
        try {
            System.out.println("Nhập tập tin đích");
            String target = sc.next();
            FileOutputStream fos = new FileOutputStream(target);
            for (int i = 0; i < strings.length(); i++) {
                char a = strings.charAt(i);
                fos.write(a);
            }
            fos.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static void readFile() {
        try {
            System.out.println("Nhập tập tin nguồn");
            String source = sc.next();
            FileInputStream fis = new FileInputStream(source);
            int i = -1;
            byte bytes[] = new byte[9999];
            while ((i = fis.read(bytes)) != -1) {
                strings = new String(bytes, 0, i);
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
