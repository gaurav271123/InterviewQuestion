package java8Features;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "I am a java developer";

        Character c1 = input.chars().mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst().orElse(null);
        System.out.println(c1);
    }
}
