package com.ifelse;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to profitLoss program");
        System.out.print("Enter costprice: ");
        double costPrice=sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sellingPrice=sc.nextDouble();
        if (costPrice==sellingPrice){
            System.out.println("No profit or loss");
        }
        else if(sellingPrice>costPrice){
            System.out.println("The profit incurred: "+(sellingPrice-costPrice));
        }else{
            System.out.println("The loss incurred: "+(costPrice-sellingPrice));
        }
    }
}
