package com.ifelse;

import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args){
        //relational operatores compare 2 quantities and produce boolean values
        //boolean can take true or false or relational operation
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);


    }
}
