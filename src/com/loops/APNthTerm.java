package com.loops;

import java.util.Scanner;

public class APNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        int term = a;

        for (int i = 1; i < n; i++) {
            term = term + d;
        }

        System.out.println("Nth term is: " + term);
    }
}