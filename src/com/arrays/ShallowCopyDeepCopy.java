package com.arrays;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args){
        int a=4;    //4 bytes
        int[] arr={10,20,30,40};    //16bytes
        int[] x=arr;    //C IS SHALLOW COPY
        x[0]=100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(x));

        int[] y=Arrays.copyOf(arr,arr.length);  //deepCopy
        y[0]=10;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(y));

    }
}
