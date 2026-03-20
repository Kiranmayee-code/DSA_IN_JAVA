package com.arrays;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];   // ✅ array created

        MulOdd2Even10.inputArray(a);
        System.out.print("Enter the number to product with : ");
        int p=sc.nextInt();
        for(int i = 0; i < a.length; i++){
            a[i] = a[i] * p;
        }
        SortArrayBuiltIn.print(a);
    }
}
