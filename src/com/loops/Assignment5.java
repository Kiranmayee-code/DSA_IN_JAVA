package com.loops;

import java.util.Scanner;

public class Assignment5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first term (a): ");
            int a = sc.nextInt();

            System.out.print("Enter common difference (d): ");
            int d = sc.nextInt();

            System.out.print("Enter n value: ");
            int n = sc.nextInt();

            int term = a;
            System.out.println(a);
            for (int i = 1; i < n; i++) {
                term = term - d;
                System.out.println(term);
            }

        }

}
