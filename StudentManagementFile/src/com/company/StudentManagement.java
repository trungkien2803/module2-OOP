package com.company;

import java.io.*;
import java.util.*;

public class StudentManagement {
    private List<Student> studentList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        Student student = new Student();
        student.studentInfo();
        studentList.add(student);
        writeDataToFile();
    }

    public void displayStudentList() {
        readDataFromFile();
        for (Student student : studentList) {
            student.displayStudentInfo();
        }
    }

    public void editStudentInfo() {
        System.out.println("Nhập mã sinh viên cần sửa");
        String id = sc.next();
        for (Student student : studentList) {
            if (id.equals(student.getId())) {
                System.out.println("Mã sinh viên");
                String newId = sc.next();
                student.setId(newId);
                System.out.println("Họ tên");
                String fullName = sc.next();
                student.setFullName(fullName);
                System.out.println("Quê quán");
                String homeTown = sc.next();
                student.setHomeTown(homeTown);
                System.out.println("Lớp");
                String ofClass = sc.next();
                student.setHomeTown(ofClass);
                System.out.println("Điểm");
                String mark = sc.next();
                student.setHomeTown(mark);
                break;
            }
        }
        writeDataToFile();
    }

    public void deleteStudentInfo() {
        System.out.println("Nhập mã sinh viên cần xóa");
        String id = sc.next();
        for (int i = 0; i < studentList.size(); i++) {
            if (id.equals(studentList.get(i).getId())) {
                studentList.remove(i);
            }
        }
        writeDataToFile();
    }

    public void sortMark() {
        boolean check = true;
        for (int i = 0; i < studentList.size() - 1 && check; i++) {
            check = false;
            for (int j = studentList.size() - 1; j > i; j--) {
                if (studentList.get(j).getMark() > studentList.get(j-1).getMark()) {
                    Collections.swap(studentList, j, j-1);
                }
                check = true;
            }
        }
        writeDataToFile();
    }

    public void sortID() {
        boolean check = true;
        for (int i = 0; i < studentList.size() - 1 && check; i++) {
            check = false;
            for (int j = studentList.size() - 1; j > i; j--) {
                if (studentList.get(i).getId().charAt(0) > studentList.get(j).getId().charAt(0)) {
                    Collections.swap(studentList, i, j);
                }
                check = true;
            }
        }
        writeDataToFile();
    }

    public void markMax() {
        sortMark();
        double max = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMark() > max)
                max = studentList.get(i).getMark();
        }
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMark() == max)
               studentList.get(i).displayStudentInfo();
        }
    }

    public void findId() {
        sortID();
        System.out.println("Nhập mã sinh viên cần tìm");
        String id = sc.next();
        int low = 0;
        int hight = studentList.size() -1;
        int mid;
        while (low <= hight){
            mid = (low + hight) / 2;
            if (studentList.get(mid).getId().equals(id)){
                studentList.get(mid).displayStudentInfo();
                break;
            }
            if (studentList.get(mid).getId().charAt(0) > id.charAt(0)){
                hight = mid -1;
            }
            if (studentList.get(mid).getId().charAt(0) < id.charAt(0)){
                low = mid +1;
            }
        }
    }

    public void statistical() {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i < studentList.size(); i++) {
            map.put(studentList.get(i).getOfClass(), 0);
        }
        for (int i = 0; i < studentList.size(); i++) {
            if (map.containsKey((studentList.get(i).getOfClass()))) {
                map.replace(studentList.get(i).getOfClass(), map.get(studentList.get(i).getOfClass()) + 1);
            }
        }
        System.out.println(map);
    }

    public void writeDataToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDataFromFile() {
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
