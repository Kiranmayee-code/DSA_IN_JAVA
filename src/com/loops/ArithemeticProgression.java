package com.loops;
import java.util.Scanner;
public class ArithemeticProgression {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ArithemeticProgression program");
        System.out.print("Enter n");
        int n=sc.nextInt();
        //2,5,8,11,14..........//dif=3 so i+3 start from 2 so i=2
        for(int i=2;i<=3*n-1;i=i+3){
            System.out.println(i);
        }
    }
}
