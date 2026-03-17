package com.loops;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to task 1");
        System.out.print("Enter your name: ");
        String name=sc.next();
        System.out.print("Enter no.of time you would like to print your name: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(name);
        }
    }
}
