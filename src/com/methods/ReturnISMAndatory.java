package com.methods;

public class ReturnISMAndatory {
    public static int sum(int a,int b){
        if(a==0&&b==0){
            return 0; //only this return is not necessary another return outside if or inside else is needed
        }else{
            return a+b;
        }

    }
    public static void main(String[] args){
        System.out.println("Hello world!");
    }
}
