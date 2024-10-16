package leetcode;

// Given an array of integers nums and an integer target,
// return the indices i and j such that nums[i] + nums[j] == target and i != j.

import java.util.HashMap;
import java.util.Map;

public class TwoIntegerSum {
    public static void main(String[] args) {
        int[] nums = {4,5,6};
        int target = 10;
        TwoIntegerSum twoIntegerSum = new TwoIntegerSum();
        int[] result = twoIntegerSum.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();
    for (int i=0 ;i< nums.length;i++){
    int res = target-nums[i];
        if (numToIndex.containsKey(res)){
            return new int[]{numToIndex.get(res),i};
        }
        numToIndex.put(nums[i],i);
    }
    return new int[]{-1,1};
    }
}
