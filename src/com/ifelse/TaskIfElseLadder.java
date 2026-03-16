package com.ifelse;
import java.util.Scanner;
public class TaskIfElseLadder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to if else if ladder program");
        System.out.print("Enter a positive integer");
        int n=sc.nextInt();
         if(n%5==0 && n%3==0){
            System.out.println("Apurva");
        }
        else if(n%5==0){
            System.out.println("Riya");
        }else if(n%3==0){
            System.out.println("Banu");
        }else{  //without else you can end else if ladder by elseif
            System.out.println("Isha");
        }
    }
}
