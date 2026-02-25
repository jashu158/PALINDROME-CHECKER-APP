import java.util.Scanner;

public class PalindromeAppUC3 {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checking Application ===");

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        // Check palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Display result
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("=== Application Ended ===");

        scanner.close();
    }

    // Method to check palindrome
    public static boolean checkPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}