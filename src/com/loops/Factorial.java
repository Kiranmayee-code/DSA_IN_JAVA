package com.loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int fact=1;
        if(n<=1) System.out.println("Factorial of "+n+"= "+fact);
        else{
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+n+" = "+fact);
        }
    }
}
