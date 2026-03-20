package com.arrays;
import java.util.Scanner;
import java.util.HashMap;
public class TwoSum {


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }

            System.out.print("Enter target: ");
            int target = sc.nextInt();

            int[] result = twoSum(nums, target);

            System.out.println("Indexes: " + result[0] + " " + result[1]);
        }

        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int complement=Math.abs(target-nums[i]);
                if(hm.containsKey(complement)){
                    return new int[]{hm.get(complement),i};
                }
                hm.put(nums[i],i);
            }

            return new int[]{-1, -1};
        }


}
