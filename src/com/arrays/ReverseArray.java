package com.arrays;

import java.util.Scanner;

public class ReverseArray {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            reverse(arr);

            // print array
            for(int i : arr){
                System.out.print(i + " ");
            }
        }

        public static void reverse(int[] arr) {

            for(int i=0;i<arr.length/2;i++){
                int temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }


        }

}
