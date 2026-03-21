package com.arrays;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        wave(arr);

        // print result
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void wave(int[] arr) {

        for(int i=0;i<arr.length-1;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }


    }
}
