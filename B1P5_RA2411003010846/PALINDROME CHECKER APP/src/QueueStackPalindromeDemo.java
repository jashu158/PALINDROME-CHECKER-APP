import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueStackPalindromeDemo {

    public static void main(String[] args) {

        System.out.println("=== FIFO vs LIFO Palindrome Demo ===");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both queue and stack
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // enqueue
            stack.push(ch);    // push
        }

        boolean isPalindrome = true;

        // Compare dequeue (FIFO) with pop (LIFO)
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // dequeue
            char fromStack = stack.pop();     // pop

            if (fromQueue != fromStack) {
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