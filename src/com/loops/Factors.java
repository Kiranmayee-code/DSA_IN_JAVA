package com.loops;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n==1) System.out.println("Factor if n if 1");
        else{
            System.out.print("Factors of "+n+"are: ");
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    System.out.print(i+" ");
                    if(i!=n/i)
                        System.out.println((n/i)+" ");
                }
            }
        }
    }
}
