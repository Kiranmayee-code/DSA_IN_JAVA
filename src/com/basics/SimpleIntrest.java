package com.basics;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Welcome to simple intrest program");
       //using double because if we take int we can get wrong value while dividing some thing use double for input var
        System.out.print("Enter principle amount");
       double p = sc.nextDouble();
       System.out.print("Enter rate of intrest");
       double r=sc.nextDouble();
       System.out.print("Enter time period");
       double t= sc.nextDouble();
       double si=(p*r*t)/100;
       System.out.println("Simple intrest is: "+si);

    }
}
