package com.ifelse;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to even or odd program");
        System.out.print("Enter any number: ");
        int n=sc.nextByte();
        if(n%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

    }
}
