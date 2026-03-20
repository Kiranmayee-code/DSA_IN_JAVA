package com.arrays;

public class OutputInputArray {
    public static void main(String[] args){
        int[] arr = {5,-8,2,67,43,-97};

        //index 0-length-1

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        for(int i:arr){
            System.out.print(i+" ");
        }

        byte[] a=new byte[4];
        for(byte i:a){
            System.out.print(i+" ");
        }
    }
}
