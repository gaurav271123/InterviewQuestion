package java8Features;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstRepeated {
    public static void main(String[] args) {
        String input = "I am a java developer";
        //String trim = input.trim();
        ///System.out.println(trim);
        Set<Character> characterSet = new HashSet<>();
        Character res = input.chars(). filter(c -> c != ' ').mapToObj(c -> (char) c).filter(c -> !characterSet.add(c)).findFirst().orElse(null);
        //Character res = input.chars(). filter(c -> c != ' ').mapToObj(c -> (char) c).filter(c -> !characterSet.add(c)).distinct().sorted(Comparator.reverseOrder()).findFirst().orElse(null);
        System.out.println(res+" : is req result");

    }
}
