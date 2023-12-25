//        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]
package org.example.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode01TwoSum {
    public static int[] twoSum(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <= nums.length - 1; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                int[] result = new int[]{ map.get(complement), i};
                System.out.println(result[0] + " " + result[1]);
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("nu exista nicio pereche gasita");
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4, 8, 9};

        twoSum(nums, 10); //0.4
        twoSum(nums, 11);  //1.4
        twoSum(nums, 5);  //0.1
        twoSum(nums, 22);  //exception - Nicio pereche gasita
    }
}
