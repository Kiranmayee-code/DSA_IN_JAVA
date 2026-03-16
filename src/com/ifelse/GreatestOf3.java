package com.ifelse;
import java.util.Scanner;
public class GreatestOf3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to greatest of 3 program");
        System.out.print("Enter num1 value: ");
        int a=sc.nextInt();
        System.out.print("Enter num2 value: ");
        int b=sc.nextInt();
        System.out.print("Enter num3 value: ");
        int c=sc.nextInt();
        if(a==b && b==c){
            System.out.println("All are equal");
        }else if(a>=b && a>=c){
            System.out.println(a+" is greater");
        }else if(b>=a && b>=c){
            System.out.println(b+" is greater");
        }else{
            System.out.println(c+" is greater");
        }
//
//        int max = (a > b) ?
//                (a > c ? a : c) :
//                (b > c ? b : c);
//
//        System.out.println("Greatest number: " + max);
    }
}
