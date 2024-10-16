package string;

public class DuplicateChar {
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Original string: " + str);
        System.out.println("String after removing duplicates: " + removeDuplicates(str));
    }
}