package java8Features;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class FindVowels {

    public static void main(String[] args) {
        String str="I am a java developer";
        String s = str.toLowerCase();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        List<Map.Entry<Integer, Character>> collect = IntStream.range(0, s.length())
                       .filter(i -> vowels.contains(s.charAt(i)))
                        .mapToObj(i -> Map.entry(i, s.charAt(i)))
                       .toList();

        for(Map.Entry<Integer, Character> i: collect){
            System.out.println("Index: "+ i.getKey()+" Vowels: "+ i.getValue());
        }

    }
}
