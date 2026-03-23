package com.basicsorting;

public class FirstLargest {
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n - 1; i++) {

            int maxIndex = 0;   // ✅ track index instead of value

            for (int j = 1; j < n-i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // ✅ correct swap
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println();
        print(arr);
    }

}
