public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if original string equals reversed string
        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is not a palindrome.");
        }

        // Program ends
        System.out.println("Program exited.");
    }
}