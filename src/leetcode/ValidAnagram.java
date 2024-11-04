package leetcode;

//   https://leetcode.com/problems/valid-anagram/

import java.util.Map;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
       String s = "anagram";
        String t = "nagaram";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }

        Map<Character, Long> sChar = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Character, Long> tChar = t.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return sChar.equals(tChar);
    }
}
