package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập file nguồn");
            String sourceFile = sc.next();
            System.out.println("Nhập file đích");
            String targetFile = sc.next();
            File source = new File(sourceFile);
            File target = new File(targetFile);
            FileReader fileReader = new FileReader(source);
            FileWriter fileWriter = new FileWriter(target);
            int c = fileReader.read();
            int index = 0;
            while (c != -1) {
                fileWriter.write((char)c);
                c = fileReader.read();
                index++;
            }
            System.out.println(index);
            fileReader.close();
            fileWriter.close();
        } catch (Exception e){
            System.err.println("File nguồn không tồn tại");
        }

    }
}
