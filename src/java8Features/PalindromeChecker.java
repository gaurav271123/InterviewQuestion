package java8Features;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        String collect = input.chars()
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .reduce("",((s1, s2) -> s2+s1));
        System.out.println(collect);

        boolean b = input.equals(collect);
        System.out.println(b+" "+input+" ");
    }
}
