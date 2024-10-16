package java8Features;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacter {
    public static void main(String[] args) {
        String s = "String data to count each character";
        String trim = s.toLowerCase().replace(" ","");
        Map<String, Long> collect = Arrays.stream(trim.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
