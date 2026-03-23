package com.basicsorting;

public class SelectionSort {
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);
        for(int i = 0; i < n - 1; i++){

            int maxIndex = i;   // ✅ track index instead of value

            for(int j = i; j < n; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }

            // ✅ correct swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println();
        print(arr);
    }


}
