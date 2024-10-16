package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondSmallestAndSecondLargest {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,2,4,8,6);
        Optional<Integer> min = arr.stream().filter(x -> x != arr.stream().min(Integer::compare).get()).min(Integer::compare);
        System.out.println(min.get());
        Integer max = arr.stream().filter(x -> x != arr.stream().max(Integer::compareTo).get()).max(Integer::compare).get();
        System.out.println(max);
    }
}
