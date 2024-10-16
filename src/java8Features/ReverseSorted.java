package java8Features;

import java.util.Arrays;
import java.util.List;

public class ReverseSorted {
    public static void main(String[] args) {
        int[] list ={9,12,4,8,1};

        List<Integer> collect = Arrays.stream(list).boxed().sorted((a,b)->b-a).toList();
        for(int i: collect){
            System.out.print(i+" ");
        }
    }
}
