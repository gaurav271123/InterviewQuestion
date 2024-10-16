package leetcode;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store the sorted string as the key and a list of anagrams as the value
        Map<String, List<String>> anagramMap = new HashMap<>();



        
        for (String s : strs) {
            // Sort the string to create the key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            // Add the original string to the corresponding anagram group
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(s);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}

