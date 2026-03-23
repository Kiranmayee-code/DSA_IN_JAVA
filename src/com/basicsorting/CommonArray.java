package com.basicsorting;

import java.util.*;

public class CommonArray {
    public static void main(String[] args){

        int[] a = {3, 4, 2, 2, 4};
        int[] b = {3, 2, 2, 7};

        ArrayList<Integer> res = commonElements(a, b);

        System.out.println(res);
    }

    public static ArrayList<Integer> commonElements(int[] a, int[] b){

        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j< b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;j++;
            }else if(a[i]<b[j]){
                i++;
            }else if(b[i]<a[j]){
                j++;
            }
        }

     return ans;
    }
}
