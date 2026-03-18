package com.loops;
import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base number: ");
        int a=sc.nextInt();
        System.out.print("Enter power number: ");
        int b=sc.nextInt();
        int op=1;
        for(int i=1;i<=b;i++){
            op*=a;
        }
        System.out.println(op);



    }
}
