package leetcode;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//
// Given two strings s and t,
// return true if the two strings are anagrams of each other, otherwise return false.

public class IsAnagram {
    public static void main(String[] args) {
        String s = "jar";
        String t= "jam";
        IsAnagram isAnagram = new IsAnagram();
       Boolean b= isAnagram.isAnagram(s,t);
        System.out.println(b);
    }
    public boolean isAnagram(String s, String t) {
        Map<Character, Long> sChar = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Character, Long> tChar = t.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return sChar.equals(tChar);
    }
}

