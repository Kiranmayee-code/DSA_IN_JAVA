package com.loops;
import java.util.Scanner;
class CompositeOrNot{
    public static void main(String[] args){
        //cpmposite number is a number which has more than factors between 2 to n-1
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if (n==1){
            System.out.println("Neither prime nor composite");
        }else{
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                System.out.println("Composite number");
                break;
            }
        }
        }
    }
}