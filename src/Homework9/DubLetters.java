package Homework9;

public class DubLetters {

    public static String duplicateLetters(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result.append(c).append(c);
        }
        return result.toString();
    }
}