package leetcode.binarySearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

// You are given an array of characters letters that is sorted in non-decreasing order,
// and a character target. There are at least two different characters in letters.
// Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.

public class FindSmallestLetterGreaterThanTarget744 {
    public static void main(String[] args) {
    char[] letters = {'c','e','f','j'};
    char target = 'z';
        char c = nextGreatestLetter(letters, target);
        System.out.println("Index : "+c);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            } else {
                start = mid+1;
            }
        }
        if(start==letters.length){
            return letters[0];
        }
        return letters[start];

    }
}
