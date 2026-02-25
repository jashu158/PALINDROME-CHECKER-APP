import java.util.Scanner;

public class PalindromeReverseCheck {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker (Reverse Method) ===");

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Reverse string using loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display reversed string
        System.out.println("Reversed string: " + reversed);

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result: It is a PALINDROME");
        } else {
            System.out.println("Result: It is NOT a palindrome");
        }

        System.out.println("=== Program Ended ===");
        sc.close();
    }
}

