package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SearchInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];   // ✅ array created

        MulOdd2Even10 m=new MulOdd2Even10();
        m.inputArray(a);
        System.out.print("Enter element to search: ");
        int x=sc.nextInt();
        boolean found=false;
        for(int i:a){
            if(i==x){
                found=true;
                break;
            }
        }
        System.out.println((found==true)?"found":"not found");
    }
}
