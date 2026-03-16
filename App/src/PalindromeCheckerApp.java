public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String text = "Madam In Eden Im Adam";

        // Normalize the string (remove spaces and convert to lowercase)
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // Convert to character array
        char[] characters = normalized.toCharArray();

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
            System.out.println("The string \"" + text + "\" is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string \"" + text + "\" is not a palindrome.");
        }
    }
}
