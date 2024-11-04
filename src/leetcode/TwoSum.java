package leetcode;

//   https://leetcode.com/problems/two-sum/description/
//   Given an array of integers nums and an integer target,
//   return the indices i and j such that nums[i] + nums[j] == target and i != j.

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
      int[] nums = {2,7,7,11,15};
        int target = 14;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]+" "+ ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = target-nums[i];
            if (map.containsKey(res)){
                return new int[]{map.get(res),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,1};
    }
}
