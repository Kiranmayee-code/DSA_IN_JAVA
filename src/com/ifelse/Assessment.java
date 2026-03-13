package com.ifelse;
import java.util.Scanner;
public class Assessment {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to absolute value program");
        System.out.print("Enter any integer ");
        int a=sc.nextInt();
        if(a<0) a=-a;
        System.out.println(a);

    }
}
