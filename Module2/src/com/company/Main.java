package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhonebookManagement phonebookManagement = new PhonebookManagement();
        String choice;
        do {
            System.out.println("1.Show");
            System.out.println("2.Add");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Find");
            System.out.println("6.Read file");
            System.out.println("7.Write file");
            choice = sc.next();
            switch (choice) {
                case "1": {
                    phonebookManagement.showPhonebookList();
                    break;
                }
                case "2": {
                    Phonebook phonebook = new Phonebook();
                    phonebookManagement.addPhonebook(phonebook);
                    break;
                }
                case "3": {
                    System.out.println("Phone number to update");
                    String phoneNumber = sc.next();
                    phonebookManagement.editPhoneBook(phoneNumber);
                    break;
                }
                case "4": {
                    System.out.println("Phone number to delete");
                    String phoneNumber = sc.next();
                    phonebookManagement.deletePhoneBook(phoneNumber);
                    break;
                }
                case "5": {
                    System.out.println("Phone number or name to find");
                    String find = sc.next();
                    phonebookManagement.findPhoneNumber(find);
                    break;
                }
                case "6": {
                    System.out.println("Y to read");
                    String agree = sc.next();
                    if (agree.equals("Y")) {
                        phonebookManagement.readDataFromFile();
                    }
                    break;
                }
                case "7": {
                    System.out.println("Y to write");
                    String agree = sc.next();
                    if (agree.equals("Y")) {
                        phonebookManagement.writeDataToFile();
                    }
                    break;
                }
                case "0": {
                    break;
                }
                default: {
                    System.out.println("This option is not available");
                    break;
                }
            }
        } while (!choice.equals("0"));
    }
}
