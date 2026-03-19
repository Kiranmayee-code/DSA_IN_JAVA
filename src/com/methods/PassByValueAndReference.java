package com.methods;

public class PassByValueAndReference {
    public static void change(int x){
        x=10;
    }
    public static void main(String[] args){
       int x=6;
        System.out.println(x);
        change(x);  //just value is passed
        System.out.println(x);
    }
}
