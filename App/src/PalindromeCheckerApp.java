import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Strategy interface
    interface PalindromeStrategy {
        boolean isPalindrome(String text);
    }

    // Stack-based strategy
    static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String text) {
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
    }

    // Deque-based strategy
    static class DequeStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String text) {
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
    }

    // Context to use selected strategy
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String text) {
        if (strategy == null) {
            throw new IllegalStateException("PalindromeStrategy not set!");
        }
        return strategy.isPalindrome(text);
    }

    public static void main(String[] args) {
        String text = "madam";

        PalindromeCheckerApp checkerApp = new PalindromeCheckerApp();

        // Use Stack strategy
        checkerApp.setStrategy(new StackStrategy());
        System.out.println("Using StackStrategy: " + (checkerApp.check(text) ? "Palindrome" : "Not Palindrome"));

        // Use Deque strategy
        checkerApp.setStrategy(new DequeStrategy());
        System.out.println("Using DequeStrategy: " + (checkerApp.check(text) ? "Palindrome" : "Not Palindrome"));
    }
}