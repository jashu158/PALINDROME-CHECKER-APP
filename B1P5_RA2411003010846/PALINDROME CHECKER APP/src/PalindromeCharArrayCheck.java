import java.util.Scanner;

public class PalindromeCharArrayCheck {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker (Character Array Method) ===");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        boolean isPalindrome = true;

        // Two-pointer technique
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {

            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: It is a PALINDROME");
        } else {
            System.out.println("Result: It is NOT a palindrome");
        }

        System.out.println("=== Program Ended ===");
        scanner.close();
    }
}