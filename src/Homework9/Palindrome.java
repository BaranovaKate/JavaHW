package Homework9;

public class Palindrome {

    static boolean isPalindrome(String word) {
        int length = word.length();

        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}