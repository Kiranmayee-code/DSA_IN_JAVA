package com.methods;
import java.util.Scanner;

public class Arguments {
    public static int max(int a,int b,int c){
        return Math.max(a,(Math.max(b,c)));
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1 value: ");
        int a=sc.nextInt();
        System.out.print("Enter num2 value: ");
        int b=sc.nextInt();
        System.out.print("Enter num3 value: ");
        int c=sc.nextInt();
        System.out.println("MAx of three numbers is = "+(max(a,b,c)));

    }
}
