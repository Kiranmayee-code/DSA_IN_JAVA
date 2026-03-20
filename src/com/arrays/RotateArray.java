package com.arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        rotate(arr, k);

        // print array
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j++;
        }
    }
}
