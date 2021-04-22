package com.company;

public class Main {
    static int arr[] = {1,4,8,9,2,11,3};
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
	    insertionSort(arr);
	    for(int e : arr){
            System.out.println(e);
        }
    }
}
