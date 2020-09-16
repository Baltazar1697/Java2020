package ua.stepess.java.course.first.string;

/**
 * Should return true if provided string is palindrome ignoring case or false otherwise.
 *
 * Examples:
 *  - mom -- true;
 *  - Mom -- true;
 *  - cat -- false;
 */
public class PalindromeDetector {

    public boolean isPalindrome(String string) {
        string.toLowerCase();
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equalsIgnoreCase(reversed);
    }

}
