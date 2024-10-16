package Arrays;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        //List<Integer> arr= Arrays.asList(1,2,3,4,2,4,5);
        int[] arr ={1,2,3,4,2,4,5};
        int[] array = Arrays.stream(arr).distinct().toArray();
        /* List<Integer> collect = arr.stream().distinct().collect(Collectors.toList());*/
        for (int i: array){
            System.out.print(i);
        }
    }
}
