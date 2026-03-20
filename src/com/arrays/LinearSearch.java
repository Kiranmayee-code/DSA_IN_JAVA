package com.arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];   // ✅ array created
        MulOdd2Even10.inputArray(a);
        System.out.print("Enter element to search: ");
        int x=sc.nextInt();
        boolean found=linearSearch(a,x);
        System.out.println(found?"Found":"Notfound");
    }
    public static boolean linearSearch(int[] a,int x){
        for(int i:a){
            if(i==x){
                return true;
            }
        }
        return false;
    }
}
