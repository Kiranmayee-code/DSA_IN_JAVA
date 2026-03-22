package com.arrays;

import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // first array
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // second array
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }

        int[] result = merge(a, b);

        for(int i : result){
            System.out.print(i + " ");
        }
    }

    public static int[] merge(int[] a, int[] b) {

        int[] ans = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                ans[k++]=a[i++];
            }else{
                ans[k++]=b[j++];
            }
        }
        while(i<a.length){
            ans[k++]=a[i++];
        }
        while(j<b.length){
            ans[k++]=b[j++];
        }
        return ans;
    }
}