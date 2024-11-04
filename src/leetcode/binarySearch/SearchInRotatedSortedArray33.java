package leetcode.binarySearch;

public class SearchInRotatedSortedArray33 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,3,4,5,6,7};
        int target = 6;
        int search = search(nums, target);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        int start = pivotIndexArray(nums);

        int firstArray = binarySearch(nums, target, 0, start);
        if (firstArray == -1) {
            int end = nums.length - 1;

            return binarySearch(nums, target, start==end?start:start+1 , nums.length - 1);
        } else {
            return firstArray;
        }

    }

    public static int binarySearch(int[] nums, int target, int start, int end) {

        if (nums[start] < nums[end]) {
            while (start <= end) {
                //  int mid = (s+e)/2 ;    // (s+e)/2 may exceed the limit
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    start = mid + 1;
                } else if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;

    }
    public static int pivotIndexArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid != start) {

                if (arr[mid] < arr[mid - 1]) {
                    end = mid - 1;
                } else if (arr[mid] < arr[mid + 1]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            else{
                return  mid;
            }
        }

        return start;
    }

}
