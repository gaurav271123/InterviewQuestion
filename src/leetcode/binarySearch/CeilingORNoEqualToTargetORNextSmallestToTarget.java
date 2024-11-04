package leetcode.binarySearch;

public class CeilingORNoEqualToTargetORNextSmallestToTarget {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int index = ceilingNumber(arr, 4);
        int value = arr[index];
        System.out.println("Index : "+ index);
        System.out.println("Value : "+ value);
    }

    // return the number of smalled no>=target
    public static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // the target is greater than the greatest number in an array
        if (target> arr[arr.length-1]){
            return -1;
        }

        while (start <= end){
            //  int mid = (s+e)/2 ;    // (s+e)/2 may exceed the limit
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
