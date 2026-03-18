package com.loops;

public class doWhile {
    public static void main (String[] args){
        int i=0;
        do{//0 will be printed even it doesnit satisfy the condition
            System.out.println(i);
            i++;
        }while(i<=10&&i>=1);
    }
}
