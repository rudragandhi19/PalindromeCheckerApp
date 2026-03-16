public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare start and end characters
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String text = "madam";

        // Call recursive function
        boolean result = isPalindrome(text, 0, text.length() - 1);

        // Display result
        if (result) {
            System.out.println("The string \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is not a palindrome.");
        }
    }
}