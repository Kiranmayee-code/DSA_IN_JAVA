package com.arrays;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();   // numbers from 1 to n

        int[] arr = new int[n - 1];  // one number missing

        for(int i = 0; i < n - 1; i++){
            arr[i] = sc.nextInt();
        }

        int result = findMissing(arr, n);

        System.out.println("Missing Number: " + result);
    }

    public static int findMissing(int[] arr, int n) {

        int total=n*(n+1)/2;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return total-sum;
    }
}