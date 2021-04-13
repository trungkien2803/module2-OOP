package com.company;

public class NextDayCalculator {
    public static int numberDayOfMonth;

    public static int checkNumberDayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberDayOfMonth = 31;
                break;
            case 2:
                if (checkLeapYear(year)) {
                    numberDayOfMonth = 29;
                } else {
                    numberDayOfMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberDayOfMonth = 30;
                break;
        }
        return numberDayOfMonth;
    }

    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void CalculateNextDay(int day, int month, int year) {
        numberDayOfMonth = checkNumberDayOfMonth(month, year);
        boolean checkDay = day > 0 && day <= numberDayOfMonth;
        boolean checkMonth = month > 0 && month <= 12;
        boolean checkYear = year > 0;
        int nextDay = day + 1;
        int nextMonth = month + 1;
        int nextYear = year + 1;
        if (checkDay && checkMonth && checkYear) {
            if (day < numberDayOfMonth) {
                System.out.printf("%-12d%-12d%-12d\n", nextDay, month, year);
            } else if (day == numberDayOfMonth && month == 12) {
                System.out.printf("%-12d%-12d%-12d\n", 1, 1, nextYear);
            } else if (day == numberDayOfMonth ) {
                System.out.printf("%-12d%-12d%-12d\n", 1, nextMonth, year);
            }
        } else {
            System.out.println("Nhập lại ngày tháng năm");
        }
    }

    public static void main(String[] args) {
        CalculateNextDay(0, 2, 2021);
    }

}
