package com.basicsorting;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void moveZeros(int[] arr) {
       int index=0;
       for(int i=0;i< arr.length;i++){
           if(arr[i]!=0){
               arr[index++]=arr[i];
           }
       }
       while(index< arr.length){
           arr[index++]=0;
       }


    }
}