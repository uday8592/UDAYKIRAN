import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class program_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get input from user
    System.out.println("Enter numbers separated by spaces:");
    String input = scanner.nextLine();

    // Convert input string to array of integers
    int[] numbers = Arrays.stream(input.split("\\s+"))
        .mapToInt(Integer::parseInt)
        .toArray();

    // Create a map to store the count of multiples
    Map<Integer, Integer> multipleCount = new HashMap<>();

    // Initialize counts for numbers 1-9
    for (int i = 1; i <= 9; i++) {
      multipleCount.put(i, 0);
    }

    // Count multiples for each number
    for (int num : numbers) {
      for (int i = 1; i <= 9; i++) {
        if (num % i == 0) {
          multipleCount.put(i, multipleCount.get(i) + 1);
        }
      }
    }

    // Print the results in the required format
    System.out.print("{");
    for (int i = 1; i <= 9; i++) {
      System.out.print(i + ": " + multipleCount.get(i));
      if (i < 9) {
        System.out.print(", ");
      }
    }
    System.out.println("}");

    scanner.close();
  }
}
