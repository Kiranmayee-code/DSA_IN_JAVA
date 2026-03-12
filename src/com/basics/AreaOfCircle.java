package com.basics;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius value");

        double radius = sc.nextDouble();

        System.out.println("Area of circle is " +
                3.141592*radius*radius);
    }
}