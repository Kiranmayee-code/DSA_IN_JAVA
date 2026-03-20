package com.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MulOdd2Even10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];   // ✅ array created

        inputArray(a);

        // print result
       for(int i=0;i<a.length;i++){
           if(i%2==0){
               a[i]*=10;
           }else{
               a[i]*=2;
           }
       }
        System.out.println(Arrays.toString(a));
    }

    public static void inputArray(int[] a){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element number " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
    }
}