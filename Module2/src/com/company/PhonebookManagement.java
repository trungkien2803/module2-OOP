package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhonebookManagement {
    private final String PHONE_NUMBER_REGEX = "\\d{10,11}";
    private final String GENDER_REGEX = "male|female|other";
    private final String BIRTH_DATE_REGEX = "^\\d{2}-\\d{2}-\\d{4}$";
    private final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private List<Phonebook> phonebookList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addPhonebook(Phonebook phonebook) {
        System.out.println("Phone number");
        String phoneNumber = checkInput(PHONE_NUMBER_REGEX);
        phonebook.setPhoneNumber(phoneNumber);
        System.out.println("Contact group");
        String contactGroup = sc.next();
        phonebook.setContactGroup(contactGroup);
        System.out.println("Name");
        String name = sc.next();
        phonebook.setName(name);
        System.out.println("Gender");
        String gender = checkInput(GENDER_REGEX);
        phonebook.setGender(gender);
        System.out.println("Address");
        String address = sc.next();
        phonebook.setAddress(address);
        System.out.println("Birth date");
        String birthDate = checkInput(BIRTH_DATE_REGEX);
        phonebook.setBirthDate(birthDate);
        System.out.println("Email");
        String email = checkInput(EMAIL_REGEX);
        phonebook.setEmail(email);
        phonebookList.add(phonebook);
    }

    public void showPhonebookList() {
        int index = 0;
        for (Phonebook phonebook : phonebookList) {
            System.out.println(phonebook);
            index++;
            if (index == 5) {
                System.out.println("Press any key to continue or 0 to exit");
                String choice = sc.next();

                if (choice.equals("0")) {
                    break;
                }
            }
        }
    }

    public void editPhoneBook(String phoneNumber) {
        boolean check = true;
        while (check) {
            for (Phonebook phonebook : phonebookList) {
                if (phonebook.getPhoneNumber().equals(phoneNumber)) {
                    System.out.println("Contact group");
                    String contactGroup = sc.next();
                    phonebook.setContactGroup(contactGroup);
                    System.out.println("Name");
                    String name = sc.next();
                    phonebook.setName(name);
                    System.out.println("Gender");
                    String gender = checkInput(GENDER_REGEX);
                    phonebook.setGender(gender);
                    System.out.println("Address");
                    String address = sc.next();
                    phonebook.setAddress(address);
                    System.out.println("Birth date");
                    String birthDate = checkInput(BIRTH_DATE_REGEX);
                    phonebook.setBirthDate(birthDate);
                    System.out.println("Email");
                    String email = checkInput(EMAIL_REGEX);
                    phonebook.setEmail(email);
                    check = false;
                    break;
                }
                if (check) {
                    System.out.println("Not found");
                    System.out.println("Retype or 0 to exit");
                    phoneNumber = sc.next();
                    if (phoneNumber.equals("0")) {
                        check = false;
                    }
                }
            }
        }
    }

    public void deletePhoneBook(String phoneNumber) {
        boolean check = true;
        while (check) {
            for (Phonebook phonebook : phonebookList) {
                if (phonebook.getPhoneNumber().equals(phoneNumber)) {
                    System.out.println("Y/y to delete");
                    String choice = sc.next();
                    if (choice.equals("Y") || choice.equals("y")) {
                        phonebookList.remove(phonebook);
                    }
                    check = false;
                }
            }
            if (check) {
                System.out.println("Not found");
                System.out.println("Retype or 0 to exit");
                phoneNumber = sc.next();
                if (phoneNumber.equals("0")) {
                    check = false;
                }
            }
        }
    }

    public void findPhoneNumber(String find) {
        boolean check = true;
        while (check) {
            for (Phonebook phonebook : phonebookList) {
                if (phonebook.getPhoneNumber().equals(find) || phonebook.getName().equals(find)) {
                    System.out.println(phonebook);
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Not found");
                System.out.println("Retype or 0 to exit");
                find = sc.next();
                if (find.equals("0")) {
                    check = false;
                }
            }

        }
    }

    public List<Phonebook> readDataFromFile() {
        try {
            FileInputStream fis = new FileInputStream("data/contacts.csv");
            ObjectInputStream ois = new ObjectInputStream(fis);
            phonebookList = (List<Phonebook>) ois.readObject();
            fis.close();
            ois.close();
        } catch (EOFException e) {
            System.err.println();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return phonebookList;
    }

    public void writeDataToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("data/contacts.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(phonebookList);
            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String checkInput(String regex) {
        Pattern pattern = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        while (!pattern.matcher(string).matches()) {
            if (pattern.matcher(string).matches()) {
                return string;
            }
            System.err.println("Dữ liệu nhập vào không đúng");
            System.err.println("Nhập lại");
            string = sc.next();
        }
        return string;
    }
}
