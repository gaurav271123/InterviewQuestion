package java8Features;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] x = {7,8,3,9,1};
        Integer res = Arrays.stream(x).boxed().sorted((a, b)-> b - a).distinct().skip(1).findFirst().orElseThrow();
        System.out.println(res);
    }
  /* public static void main(String[] args) {
       int[] x = {7, 8, 3, 9, 1};

       int secondHighest = Arrays.stream(x)
               .boxed()                       // Box the int stream to Integer stream
               .sorted((a, b) -> b - a)       // Sort in descending order
               .distinct()                    // Remove duplicates if needed
               .skip(1)                       // Skip the first (highest) element
               .findFirst()                   // Get the second highest
               .orElseThrow(() -> new RuntimeException("No second highest element found"));

       System.out.println("Second highest element: " + secondHighest);
   }*/
}
