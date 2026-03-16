package com.ifelse;
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to even or odd program");
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        System.out.println((n%2==0)?"Even":"Odd");
    }
}
