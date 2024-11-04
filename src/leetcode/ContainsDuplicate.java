package leetcode;

// https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
    int[] nums = {1,2,3,1};
        boolean res= containsDuplicates(nums);
        System.out.println(res);
    }
    public static boolean containsDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            if (set.contains(n)){
                return true;
            }
            set.add(n);

        }
        return false;
    }
}
