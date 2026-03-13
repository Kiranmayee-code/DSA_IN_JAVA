package com.ifelse;
import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to 4 digit number program");
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        //remember computer does'nt take leading zeros
        if(n>=1000&&n<10000){
            System.out.println("It is a 4 digit number");
        }else{
            System.out.println("It is not a 4 digit number");
        }

    }
}
