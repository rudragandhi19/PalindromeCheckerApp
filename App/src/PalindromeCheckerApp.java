import java.util.Stack;

// Class responsible only for palindrome checking
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String text) {

        // Internal data structure: Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // Compare characters with stack pop
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(text);

        // Display result
        if (result) {
            System.out.println("The string \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is not a palindrome.");
        }
    }
}