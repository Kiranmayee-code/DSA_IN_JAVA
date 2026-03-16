package com.ifelse;
import java.util.Scanner;
public class GuessQuadrant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to guessing quadrant program");
        System.out.print("Enter x-axis value: ");
        int x_axis=sc.nextInt();
        System.out.print("Enter y-axis value: ");
        int y_axis=sc.nextInt();
        if(x_axis==0 && y_axis==0){
            System.out.println("origin");
        }else if(x_axis==0){
            System.out.println("point lies on y-axis");
        } else if (y_axis==0) {
            System.out.println("point lies on x-axis");
        }  else if (x_axis > 0)
            System.out.println(y_axis > 0 ? "Quadrant 1" : "Quadrant 4");
        else
            System.out.println(y_axis > 0 ? "Quadrant 2" : "Quadrant 3");
    }

}
