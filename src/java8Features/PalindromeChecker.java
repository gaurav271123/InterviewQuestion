package java8Features;

import java.util.Arrays;

public class PalindromeChecker {
    /*public static void main(String[] args) {
        String input = "madam";
        String collect = input.chars()
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .reduce("",((s1, s2) -> s2+s1));
        System.out.println(collect);

        boolean b = input.equals(collect);
        System.out.println(b+" "+input+" ");
    }*/

    public static void main(String[] args) {
        int x = 121;
        boolean isPalindrome = isPalindrome(x);
        System.out.println(x + " is a palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

