import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Stack-based palindrome check
    public static boolean stackPalindrome(String text) {
        Stack<Character> stack = new Stack<>();
        for (char ch : text.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : text.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque-based palindrome check
    public static boolean dequePalindrome(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : text.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // Two-pointer approach
    public static boolean twoPointerPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "madam".repeat(10000); // Large input for measurable time

        // Stack approach
        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(text);
        long stackTime = System.nanoTime() - startTime;

        // Deque approach
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(text);
        long dequeTime = System.nanoTime() - startTime;

        // Two-pointer approach
        startTime = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(text);
        long twoPointerTime = System.nanoTime() - startTime;

        // Display results
        System.out.println("Stack approach: " + (stackResult ? "Palindrome" : "Not Palindrome") + ", Time: " + stackTime + " ns");
        System.out.println("Deque approach: " + (dequeResult ? "Palindrome" : "Not Palindrome") + ", Time: " + dequeTime + " ns");
        System.out.println("Two-pointer approach: " + (twoPointerResult ? "Palindrome" : "Not Palindrome") + ", Time: " + twoPointerTime + " ns");
    }
}