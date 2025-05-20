import java.util.Scanner;

public class program_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get input from user
    System.out.print("Enter a number (a): ");
    int a = scanner.nextInt();

    // Generate and print the series
    for (int i = 0; i < a; i++) {
      // Calculate the odd number: 2*i + 1
      int number = 2 * i + 1;

      // Print the number
      System.out.print(number);

      // Add comma and space if it's not the last number
      if (i < a - 1) {
        System.out.print(", ");
      }
    }

    // Add newline at the end
    System.out.println();

    scanner.close();
  }
}
