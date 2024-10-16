package java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsWithCount {
    public static void main(String[] args) {
        String[] names ={"AA", "BB", "AA", "CC","BB"};
        //List<String> names = Arrays.asList("AA", "BB", "AA", "CC","BB");

        Map<String, Long> collect =Arrays.stream(names).filter(x -> Collections.frequency(List.of(names), x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
