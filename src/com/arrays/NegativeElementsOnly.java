package com.arrays;
import java.util.Scanner;

public class NegativeElementsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element number " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            if(i<0) {
                System.out.print(i + " ");
            }
        }
    }
}
