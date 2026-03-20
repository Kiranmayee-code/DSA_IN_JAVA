package com.arrays;

import java.util.Scanner;

public class MinOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element number " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i : a) {
            if(i<min){
                min=i;
            }
        }
        System.out.println(min);
    }
}
