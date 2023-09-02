import java.util.Scanner;
public class Homework5 {

    public static void creditCardTask(){
        Scanner sc = new Scanner(System.in);

        CreditCard cardFirst = new CreditCard();
        cardFirst.num = 23546786;
        cardFirst.sum = 200;

        CreditCard cardSecond = new CreditCard();
        cardSecond.num = 97897222;
        cardSecond.sum = 575;

        CreditCard cardThird = new CreditCard();
        cardThird.num = 68892486;
        cardThird.sum = 893;

        while (true) {
            System.out.println("Enter number of task: \n" +
                    "1 - Add sum to card 1\n" +
                    "2 - Add sum to card 2\n" +
                    "3 - Add sum to card 3\n" +
                    "4 - To take money out from account of card 1\n" +
                    "5 - To take money out from account of card 2\n" +
                    "6 - To take money out from account of card 3\n" +
                    "7 - Show information about all cards\n");
            int var = sc.nextInt();
            switch (var) {
                case 1 -> cardFirst.addToSum();
                case 2 -> cardSecond.addToSum();
                case 3 -> cardThird.addToSum();
                case 4 -> cardFirst.deleteFromSum();
                case 5 -> cardSecond.deleteFromSum();
                case 6 -> cardThird.deleteFromSum();
                case 7 -> {
                    cardFirst.showInformation();
                    cardSecond.showInformation();
                    cardThird.showInformation();
                }
            }
        }
    }

    public static void computerTask(){
        System.out.println("Computer 1:");
        Computer compOne = new Computer(2000, "Asus");
        compOne.displayInfo();

        System.out.println("Computer 2:");
        RAM ramFirst = new RAM(10, "DDR4 DIMM");
        HDD hddSecond = new HDD(512, "Seagate", "Internal");
        Computer computerSecond = new Computer(1500, "Aser", ramFirst, hddSecond);
        computerSecond.displayInfo();
    }

        public static void bankTask(){
            Scanner sc = new Scanner(System.in);
            ATM bankFirst = new ATM(10, 10, 10);
            System.out.println("Enter number of task:\n" +
                    "1- Add money\n" +
                    "2 - To take money out from account\n" +
                    "3 - Show information\n");
            int variant = sc.nextInt();
            switch (variant) {
                case 1 -> bankFirst.add();
                case 2 -> bankFirst.deleteFromSum();
                case 3 -> bankFirst.showInformation();
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of task:\n1 - CreditCard\n2 - Computer" +
                    "\n3 - ATM \n0 - to exit");
            int task = sc.nextInt();
            switch (task) {
                case 1 -> creditCardTask();
                case 2 -> computerTask();
                case 3 -> bankTask();
                }
            }
    }
}