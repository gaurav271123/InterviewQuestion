package leetcode.binarySearch;

public class SortedBinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,3,5,6,8};
        int i = binarySearch(arr, 8);
        System.out.println("The Index is : "+ i);
    }
    public static int binarySearch(int [] arr, int target){
        int s =0;
        int e = arr.length-1;

        while (s <= e){
        //  int mid = (s+e)/2 ;    // (s+e)/2 may exceed the limit
            int mid = s + (e-s)/2;
            if(target < arr[mid]){
                e = mid-1;
            } else if (target > arr[mid]) {
                s = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
