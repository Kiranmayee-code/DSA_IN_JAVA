package com.methods;
import java.util.Scanner;
public class SwapTwoNum {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a=sc.nextInt();
        System.out.print("Enter b value: ");
        int b=sc.nextInt();
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);

    }
}
