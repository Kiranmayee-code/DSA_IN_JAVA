package com.arrays;
import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = secondMax(arr);

        System.out.println("Second Max: " + result);
    }

    public static int secondMax(int[] arr) {

        int largest=arr[0];
        int secondlargest=Integer.MIN_VALUE;;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        if(secondlargest==Integer.MIN_VALUE) return -1;
        return secondlargest;
    }
}