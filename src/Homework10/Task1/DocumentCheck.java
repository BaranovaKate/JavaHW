package Homework10.Task1;

public class DocumentCheck {

    public static void findABC(String documentNumber) throws ABC {
        boolean containsABC = false;
        String[] blocks = documentNumber.split("-");
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].equalsIgnoreCase("abc")) {
                containsABC = true;
                break;
            }
        }
        if (containsABC) {
            System.out.println("ABC yes");
        } else {
            throw new ABC("Not contains ABC");
        }
    }

    public static void find555(String documentNumber) throws FiveFiveFive{
        if(!documentNumber.startsWith("555")){
            throw new FiveFiveFive("Not start with 555");
        }
    }

    public static void find1a2b(String documentNumber) throws OneATwoB{
        if(!documentNumber.endsWith("1a2b")){
            throw new OneATwoB("Not end with 1a2b");
        }
    }

}
