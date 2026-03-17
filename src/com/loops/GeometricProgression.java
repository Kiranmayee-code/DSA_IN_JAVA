package com.loops;
import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int r= sc.nextInt();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a*r;
        }
    }

}
