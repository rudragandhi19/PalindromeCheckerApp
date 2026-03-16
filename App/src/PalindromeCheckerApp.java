public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String text = "madam";

        // Convert string to character array
        char[] characters = text.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is not a palindrome.");
        }
    }
}
