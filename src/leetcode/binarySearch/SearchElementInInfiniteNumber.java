package leetcode.binarySearch;

//   https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class SearchElementInInfiniteNumber {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int res = binarySearch(arr, 5);
        System.out.println(res);

    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[end]< target){
                int newStart = end+1;
                // double the box
                // end = previous end + sizeOfBox*2
                 end = end + (end- start + 1)*2;
                //end = end*2 +1;
                start = newStart;
            }else if(target < arr[mid]){
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
