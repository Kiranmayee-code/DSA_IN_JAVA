package com.loops;
import java.util.Scanner;
public class Mutiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to multiplication program");
        System.out.print("Enter the number of which table you want: ");
        int n=sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

