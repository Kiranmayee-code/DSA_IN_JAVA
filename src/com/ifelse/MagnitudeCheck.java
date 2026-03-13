package com.ifelse;
import java.util.Scanner;

public class MagnitudeCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to magnitude check program");
        //magnitude means absolute value
        System.out.print("Enter a number");
        int n=sc.nextInt();
        if(Math.abs(n)<69){
            System.out.println("Magnitude is smaller than 69");
        }else{
            System.out.println("Magnitude is greater than 69");
        }
    }
}
