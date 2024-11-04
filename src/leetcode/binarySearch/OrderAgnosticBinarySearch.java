package leetcode.binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr ={7,6,5,4,2};
        int ans = binarySearch(arr,6);
        System.out.println(ans);
    }
    public static int binarySearch(int [] arr, int target){
        int start =0;
        int end = arr.length-1;

        if (arr[start]>arr[end]){
            while (start <= end){
                int mid = start + (end-start)/2;
                if (target < arr[mid]){
                   start = mid+1;
                } else if (target > arr[mid]) {
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }else{
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
        }

        return -1;
    }
}
