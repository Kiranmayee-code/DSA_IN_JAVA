package com.arrays;

import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean result = isSorted(arr);

        System.out.println(result ? "Sorted" : "Not Sorted");
    }

    public static boolean isSorted(int[] arr) {

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
