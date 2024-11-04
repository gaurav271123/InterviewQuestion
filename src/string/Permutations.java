package string;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        String str = "abc";
        List<String> result = new ArrayList<>();
        permute(str, "", result);
        System.out.println("Permutations: " + result);
    }

    private static void permute(String str, String prefix, List<String> result) {
        int n = str.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), result);
            }
        }
    }

}
