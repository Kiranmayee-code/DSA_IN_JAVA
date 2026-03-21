package com.arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListInJavaBasic {
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a.get(2));   //]arr[2]
        System.out.println(a.set(1,50));    //arr[3]=50
        System.out.println(a);
//        a.remove(1);
//        a.remove(Integer.valueOf(10));
//        a.clear();
//        System.out.println(a);
//        System.out.println(a.size());



//        for(int i=0;i<a.size();i++){
//            System.out.println(a.get(i));
//        }


//        for(int i:a){
//            System.out.println(i);
//        }


        Iterator<Integer> it=a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


       // Collections.reverse(a);


    }
}
