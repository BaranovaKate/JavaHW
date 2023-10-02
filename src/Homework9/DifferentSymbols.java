package Homework9;

public class DifferentSymbols {

    public static void findSimbols() {
        String s = "fffff ab f 1234 jkjk";
        String[] arr = s.split(" ");
        int[] charAmount = new int[arr.length];

        for (int i = 0; i<arr.length; i++){
            charAmount[i] = getChars(arr[i]);
        }
        int min = charAmount[0];
        int minInd = 0;

        for (int i = 0; i<charAmount.length; i++){
            if (min>charAmount[i]) {
                min = charAmount[i];
                minInd = i;
            }
        }
        System.out.println(arr[minInd]);
    }

    private static int getChars(String str){
        char[] arr = new char[str.length()];
        int ind = 0;
        for (int i = 0; i < str.length(); i++){
            if (!isInArr(arr, str.charAt(i)))
                arr[ind++] = str.charAt(i);
        }
        return ind;
    }

    private static boolean isInArr(char[] arr, char ch){
        for (char c : arr){
            if (c==ch) return true;
            else if (c==0) return false;
        }
        return false;
    }
}