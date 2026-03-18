package com.loops;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean is_Prime=true;
        if(n<=1){
            System.out.println("Neither prime nor composite");
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){//instead of Math.sqrt csn use i*i<=n
                if(n%i==0){
                    is_Prime=false;
                    break;
                }
            }
            if(is_Prime==true) System.out.println("Prime number");
            else System.out.println("Not Prime");
        }
    }
}
