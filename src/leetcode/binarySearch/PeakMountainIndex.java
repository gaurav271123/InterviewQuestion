package leetcode.binarySearch;

//   https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class PeakMountainIndex {
    public static void main(String[] args) {
        int[] arr = {24,25,69,100,0,1,2};
        int i = peakIndexInMountainArray(arr);
        System.out.println(i);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
                if (arr[mid]> arr[mid+1]){
                    end= mid;
                }else{
                    start = mid+1;
                }
        }

        return start;
    }

}
