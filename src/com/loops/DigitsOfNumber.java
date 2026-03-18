package com.loops;
import java.util.Scanner;
public class DigitsOfNumber {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a digit: ");
       int n=sc.nextInt();
        int count=0;
       if (n==0){
            count=1; //n can be anything
        }else{
            while (n >0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println(count);
    }
}
