package Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicate {
    public static void main(String[] args) {
        /*List<Integer> arr= Arrays.asList(1,2,3,4,2,4,5);
        Map<Integer,Long> count=arr.stream().collect(Collectors.groupingByConcurrent(Function.identity(),Collectors.counting()));
        count.forEach((key, value)-> System.out.println(key+" "+value));*/

        int[] arr={1,2,3,4,2,4,5};
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        collect.forEach((key, value)-> System.out.println(key+" "+ value));
    }
}
