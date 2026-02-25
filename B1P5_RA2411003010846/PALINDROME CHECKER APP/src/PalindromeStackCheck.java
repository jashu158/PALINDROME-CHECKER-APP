import java.util.Scanner;
import java.util.Stack;

public class PalindromeStackCheck {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker (Stack Method) ===");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("Result: It is a PALINDROME");
        } else {
            System.out.println("Result: It is NOT a palindrome");
        }

        System.out.println("=== Program Ended ===");
        scanner.close();
    }
}