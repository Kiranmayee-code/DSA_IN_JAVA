package com.ifelse;
import java.util.Scanner;
public class SidesOfATriangle {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to program");
        System.out.print("Enter side a value: ");
        int a=sc.nextInt();
        System.out.print("Enter side b value: ");
        int b=sc.nextInt();
        System.out.print("Enter side c value: ");
        int c=sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){    //in condition we dint keep brackets for arthemetic because they have highest priority than relational operators
            System.out.println("valid triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
