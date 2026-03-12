package com.basics;

import java.util.Scanner;

public class SumOFTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to sum of 2 integers program");
        System.out.print("Enter num1 value: ");
        int a = sc.nextInt();
        System.out.print("Enter num2 value");
        int b = sc.nextInt();
        System.out.println("Sum of 2 numbers is: "+a+b);
    }
}
