package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Admissions {
    private List<Student> studentList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void displayStudentList(){
        for (Student student : studentList){
            student.displayStudentInfo();
        }
    }
    public void sortName(){
        for (int i = 0; i < studentList.size()-1;i++){
            char min = studentList.get(i).getFullName().charAt(0);
            Student minStudent = studentList.get(i);
            int index = i;
            for (int j = i+1; j<studentList.size(); j++){
                if (min > studentList.get(j).getFullName().charAt(0)){
                    min = studentList.get(j).getFullName().charAt(0);
                    minStudent = studentList.get(j);
                    index = j;
                }
            }
            if(index != i){
                studentList.set(index,studentList.get(i));
                studentList.set(i,minStudent);
            }
        }
    }
    public void sortId(){
        for (int i = 0; i < studentList.size()-1;i++){
            char min = studentList.get(i).getStudentId().charAt(0);
            Student minStudent = studentList.get(i);
            int index = i;
            for (int j = i+1; j<studentList.size(); j++){
                if (min > studentList.get(j).getStudentId().charAt(0)){
                    min = studentList.get(j).getStudentId().charAt(0);
                    minStudent = studentList.get(j);
                    index = j;
                }
            }
            if(index != i){
                studentList.set(index,studentList.get(i));
                studentList.set(i,minStudent);
            }
        }
    }

    public void findId(String id){
        sortId();
        int left = 0;
        int right = studentList.size();
        int index = 0;
        while (left <= right){
            int mid = (left+right)/2;
            if (id.equals(studentList.get(mid).getStudentId())){
                studentList.get(mid).displayStudentInfo();
                index++;
                break;
            } else if(id.charAt(0) < studentList.get(mid).getStudentId().charAt(0)){
                right = mid -1;
            }else if(id.charAt(0) > studentList.get(mid).getStudentId().charAt(0)){
                left = mid + 1;
            }
        }
        if (index == 0){
            System.out.printf("Khong tim thay");
        }
    }
    public void delete(String id){
        for (Student student : studentList){
            if(id.equals(student.getStudentId())){
                studentList.remove(student);
                break;
            }
        }
    }
    public void editInfo(String id){
        for (Student student : studentList){
            if(id.equals(student.getStudentId())){
                System.out.println("Số báo danh");
                String newId = sc.next();
                System.out.println("Họ và tên");
                String fullName = sc.next();
                System.out.println("Địa chỉ");
                String address = sc.next();
                System.out.println("Khu vực");
                String area = sc.next();

                student.setStudentId(newId);
                student.setAddress(address);
                student.setFullName(fullName);
                student.setArea(area);
                break;
            }
        }
    }
}
