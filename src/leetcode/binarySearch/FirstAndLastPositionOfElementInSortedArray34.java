package leetcode.binarySearch;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

// Given an array of integers nums sorted in non-decreasing order,
// find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

public class FirstAndLastPositionOfElementInSortedArray34 {
    public static void main(String[] args) {
        int [] arr ={5,7,7,8,8,10};
        int target = 7;
        int[] res = searchRange(arr, target);
        for (int x: res){
            System.out.println(x);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans =-1;
        int start =0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (nums[mid]<target){
                start = mid+1;
            }else if (nums[mid]> target){
               end = mid-1;
            }else{
                ans =mid;
                if (findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
