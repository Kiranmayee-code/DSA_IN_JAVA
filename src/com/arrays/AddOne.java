package com.arrays;

import java.util.Scanner;
import java.util.Vector;

public class AddOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        Vector<Integer> arr = new Vector<>();

        // input
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            arr.add(k);   // ✅ use add instead of set
        }

        Vector<Integer> result = addOne(arr);

        // print
        for(int i : result){
            System.out.print(i + " ");
        }
    }

    public static Vector<Integer> addOne(Vector<Integer> arr){

        for(int i = arr.size() - 1; i >= 0; i--){
            if(arr.get(i) < 9){
                arr.set(i, arr.get(i) + 1);
                return arr;
            }
            arr.set(i, 0);
        }

        // all 9s case
        arr.add(0, 1);

        return arr;
    }
}