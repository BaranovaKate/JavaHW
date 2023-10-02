package Homework9;

import java.util.Scanner;

public class Homework9 {

    public static void TaskOne(){
        String documentNumber = "1234-abc-5678-Xyz-1a2b";

        DocumentCheck.printFirstTwoBlocks(documentNumber);
        DocumentCheck.replaceLetters(documentNumber);
        DocumentCheck.onlyLowerCaseLetters(documentNumber);
        DocumentCheck.printLettersInUpperCase(documentNumber);
        DocumentCheck.find555(documentNumber);
        DocumentCheck.find1a2b(documentNumber);
        DocumentCheck.findABC(documentNumber);
    }
    public static void TaskSecond(){
        String stringForTaskTwo = "Find min and max word in the string";

        String shortestW = MinMaxWord.findMin(stringForTaskTwo);
        String longestW = MinMaxWord.findMax(stringForTaskTwo);

        System.out.println("Shortest word in string is: " + shortestW);
        System.out.println("Longest word in string is: " + longestW);
    }
    public static void TaskFour(){
        String find = "LaaL hello goodbye";
        System.out.println("Enter number of word: ");
        Scanner sc = new Scanner(System.in);
        int word = sc.nextInt();

        String[] words = find.split(" ");

        if (word <= 0 || word > words.length) {
            System.out.println("Error. The word with this number is not in String.");
            return;
        }

        String inputWord = words[word - 1];
        if (Palindrome.isPalindrome(inputWord)) {
            System.out.println(inputWord + " Is palindrome ");
        } else {
            System.out.println(inputWord + "Is not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of task from 1 to 5: ");
            int task = sc.nextInt();
            switch (task) {
                case 1 -> TaskOne();
                case 2 -> TaskSecond();
                case 3 -> DifferentSymbols.findSimbols();
                case 4 -> TaskFour();
                case 5 -> {
                    String input = "Hello";
                    String resultStr = DubLetters.duplicateLetters(input);
                    System.out.println(resultStr);
                }
            }
        }
    }
}