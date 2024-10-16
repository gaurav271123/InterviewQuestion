package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given an integer array nums,
// return true if any value appears more than once in the array, otherwise return false.
public class DuplicateInteger {
    public static void main(String[] args) {
    int[] nums ={1, 2, 3, 3};
    DuplicateInteger duplicateInteger= new DuplicateInteger();
    Boolean res = duplicateInteger.hasDuplicate(nums);
        System.out.println(res);
    }
    public boolean hasDuplicate(int[] nums) {
        List<Integer> collect = Arrays.stream(nums).boxed().distinct().toList();
        if (collect.size() == nums.length){
            return false;
        }
        return true;
    }
}

