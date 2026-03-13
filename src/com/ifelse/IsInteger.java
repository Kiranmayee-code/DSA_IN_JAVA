package com.ifelse;

import java.util.Scanner;
public class IsInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n=sc.nextDouble();
        if(n==(int)n){
            System.out.println("It is an integer");
        }else{
            System.out.println("It is not an integer");
        }
    }

}
