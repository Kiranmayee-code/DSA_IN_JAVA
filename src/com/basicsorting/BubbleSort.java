package com.basicsorting;

public class BubbleSort {
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);
//        for(int i=0;i<n-1;i++){
//        for (int j = 0; j < n - 1-j; j++) {
//            if (arr[j] > arr[j + 1]) {
//                int temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//            }
//        }
//    }


        //buble sort optimized

        for(int i=0;i<n-1;i++){ //n-1 passes
            boolean is_Sorted=true;
            for (int j = 0; j < n - 1-i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    is_Sorted=false;
                }
            }
            if(is_Sorted) break;
        }
        System.out.println();
        print(arr);
    }
}
