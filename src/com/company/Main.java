package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int x = 0; x < array.length - 1; x++) {
                if (array[x] > array[x+1]) {
                    int tmp = array[x];
                    array[x] = array[x+1];
                    array[x+1] = tmp;
                }
            }
        }
        return array;
    }
}
