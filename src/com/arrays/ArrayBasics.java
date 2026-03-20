package com.arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args){
//        int[] x ={1,2,3,4,5,6};//indexing
//        System.out.println(x[0]);
//        x[3]=89;  //mutable
//        System.out.println(x[3]);
        int[] arr = new int[4];//size 4 indexes 0,1,2,3
        arr[0]=10;
        arr[1]=-18;
        arr[2]=19;
        arr[3]=-20;
        System.out.println(Arrays.toString(arr));
    }
}
