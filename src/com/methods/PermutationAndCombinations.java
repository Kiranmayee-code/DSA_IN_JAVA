package com.methods;
import java.util.Scanner;
public class PermutationAndCombinations {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.print("Enter r: ");
        int r=sc.nextInt();
        int ncr=factorial(n)/(factorial(r)*factorial(n-r));
        int npr=factorial(n)/factorial(n-r);
    }
    public static int factorial(int x){
        int fact=1;
        if(x<=0) return 0;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }
}
