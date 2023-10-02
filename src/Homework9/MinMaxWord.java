package Homework9;
public class MinMaxWord {

    public static String findMax(String stringForTaskTwo){
        String[] words = stringForTaskTwo.split(" ");
        String longestWord = "";

        for(String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static String findMin(String stringForTaskTwo){
        String[] words = stringForTaskTwo.split(" ");
        String shortestWord = "";

        for(String word : words) {
            if (word.length() < shortestWord.length() || shortestWord.isEmpty() ) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }
}