package leetcode.binarySearch;

public class PivotSortedArray {
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

//        if(arr[start]< arr[end]){
//            return end;
//        }
        while (start<=end){
            int mid = start +(end-start)/2;
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] > arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid]< arr[mid-1]){
//                end= mid-1;
//            }else if (arr[mid]< arr[mid+1]){
//                start = mid+1;
//            }else {
//                return mid;
//            }
//        }
//
//        return start;

//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start<=end){
//            int mid = start +(end-start)/2;
//            if (mid< end && arr[mid] > arr[mid+1]){
//                return mid;
//            }
//            if (mid>start && arr[mid]> arr[mid-1]){
//                return mid-1;
//            }
//            if (arr[mid]<=arr[start]){
//                end = mid-1;
//            }else{
//                start = mid +1;
//            }
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int i = findPivot(nums);
        System.out.println(i);
    }
}
