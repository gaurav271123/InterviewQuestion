package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,27,4,8,12};
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int index1, int index2){
       int temp= arr[index1];
       arr[index1]= arr[index2];
       arr[index2] = temp;
    }
}
