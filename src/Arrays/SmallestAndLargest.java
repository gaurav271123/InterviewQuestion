package Arrays;

import java.util.Arrays;
import java.util.List;

public class SmallestAndLargest {
    public static void main(String[] args) {

        List<Integer> arr =Arrays.asList(3,2,4,8,6);
        Integer min = arr.stream().min(Integer::compare).get();
        System.out.println(min);
        Integer max = arr.stream().max(Integer::compare).get();
        System.out.println(max);


       /* int[] arr={3,2,4,8,6};
        int smallest = Arrays.stream(arr).min().getAsInt();
        int largest = Arrays.stream(arr).max().getAsInt();
        System.out.println("Smallest "+smallest);
        System.out.println("Largest "+ largest);*/
    }
}
