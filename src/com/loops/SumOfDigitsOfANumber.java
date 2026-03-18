package com.loops;
import java.util.Scanner;
public class SumOfDigitsOfANumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(Math.abs(sum));//because -a%b ==negative
    }
}
