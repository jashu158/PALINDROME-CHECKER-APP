import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeDek {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker (Deque Method) ===");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
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