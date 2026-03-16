package com.ifelse;
import java.util.Scanner;
public class AreaGreaterOrPerimeter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to program");
        System.out.print("Enter length of rectangle: ");
        double length=sc.nextDouble();
        System.out.print("Enetr breadth of rectangle: ");
        double breadth=sc.nextDouble();
        double area=length*breadth;
        double perimeter=2*(length+breadth);
        if(area>perimeter){
            System.out.println("Area is grater than perimeter");
        }else if(perimeter>area){
            System.out.println("Perimeter is greater tha area");
        }else{
            System.out.println("Both area and perimeter are equal");
        }
    }
}
