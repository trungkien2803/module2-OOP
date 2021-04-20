package com.company;

import java.util.Arrays;

public class Main {
    static int binarySearch(int arr[], int left, int right, int value) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (value == arr[mid]) {
                return mid;
            }
            if (value < arr[mid]) {
                return binarySearch(arr, left, mid - 1, value);
            }
            if (value > arr[mid]) {
                return binarySearch(arr, mid + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 1, 18, 3, 4, 14, 9, 58, 41, 2, 6, 19, 42, 23};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,0,arr.length,58));
    }
}
