package Homework9;

public class DocumentCheck {

    public static void printFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        if (blocks.length >= 5) {
            System.out.println("Firs two blocks: " + blocks[0] + blocks[2]);
        } else {
            System.out.println("Document number is incorrect");
        }
    }

    public static void replaceLetters(String documentNumber){
        String replaceString = documentNumber.replaceAll("[a-zA-Z]", "*");
        System.out.println("Replace letters to * : " + replaceString);
    }

    public static void onlyLowerCaseLetters(String documentNumber){
        String lowercase = documentNumber.toLowerCase();
        String resultstr = lowercase.replaceAll("[^a-z]+", "/");
        System.out.println("Letters in LowerCase: " + resultstr);
    }

    public static void printLettersInUpperCase(String documentNumber) {
        StringBuilder result = new StringBuilder();

        for (char c : documentNumber.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
            } else if (c == '-') {
                result.append('/');
            }
        }
        System.out.println("Letters in UpperCase with / : " + result.toString());
    }

    public static void find555(String documentNumber){
        boolean res = documentNumber.startsWith("555");

        if(res){
            System.out.println("Contains 555");
        }else {
            System.out.println("Not contains 555");
        }
    }

    public static void find1a2b(String documentNumber){
        boolean res = documentNumber.endsWith("1a2b");

        if(res){
            System.out.println("Contains 1a2b");
        }else {
            System.out.println("Not contains 1a2b");
        }
    }

    public static void findABC(String documentNumber) {
        boolean containsABC = false;
        String[] blocks = documentNumber.split("-");

        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].equalsIgnoreCase("abc")) {
                containsABC = true;
                break;
            }
        }

        if (containsABC) {
            System.out.println("Contains abc");
        } else {
            System.out.println("Not contains abc");
        }
    }
}