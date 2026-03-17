package com.loops;
import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=0;i<=n-1;i++){
            System.out.println(i+1);
            System.out.println(n-i);
        }
    }
}
