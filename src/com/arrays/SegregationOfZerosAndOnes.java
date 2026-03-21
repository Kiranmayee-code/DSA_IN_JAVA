package com.arrays;

import java.util.Scanner;
public class SegregationOfZerosAndOnes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        segregate(arr);

        // print result
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void segregate(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
            right--;
        }else{
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    }
}