import java.util.Scanner;
public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM bank1 = new ATM(10, 10, 10);
        int task;
        while (true) {
            System.out.println("Enter number of task:\n1 - CreditCard\n2 - Computer" +
                    "\n3 - ATM \n0 - to exit");
            task = sc.nextInt();
            switch (task) {
                case 1 -> {
                    CreditCard card1 = new CreditCard();
                    card1.num = 23546786;
                    card1.sum = 200;
                    CreditCard card2 = new CreditCard();
                    card2.num = 97897222;
                    card2.sum = 575;
                    CreditCard card3 = new CreditCard();
                    card3.num = 68892486;
                    card3.sum = 893;
                    int var;
                    while (true) {
                        System.out.println("Enter number of task: \n" +
                                "1 - Add sum to card 1\n" +
                                "2 - Add sum to card 2\n" +
                                "3 - Add sum to card 3\n" +
                                "4 - To take money out from account of card 1\n" +
                                "5 - To take money out from account of card 2\n" +
                                "6 - To take money out from account of card 3\n" +
                                "7 - Show information about all cards\n" +
                                "0 - If u want to exit");
                        var = sc.nextInt();
                        switch (var) {
                            case 1 -> card1.addToSum();
                            case 2 -> card2.addToSum();
                            case 3 -> card3.addToSum();
                            case 4 -> card1.deleteFromSum();
                            case 5 -> card2.deleteFromSum();
                            case 6 -> card3.deleteFromSum();
                            case 7 -> {
                                card1.showInformation();
                                card2.showInformation();
                                card3.showInformation();
                            }
                            case 0 -> System.exit(0);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Computer 1:");
                    Computer compOne = new Computer(2000, "Asus");
                    compOne.displayInfo();
                    System.out.println("Computer 2:");
                    RAM ram2 = new RAM(10, "DDR4 DIMM");
                    HDD hdd2 = new HDD(512, "Seagate", "Internal");
                    Computer computerSecond = new Computer(1500, "Aser", ram2, hdd2);
                    computerSecond.displayInfo();
                }
                case 3 -> {
                    System.out.println("Enter number of task:\n" +
                            "1- Add money\n" +
                            "2 - To take money out from account\n" +
                            "3 - Show information\n" +
                            "0 - If u want to exit\n");
                    int variant;
                    variant = sc.nextInt();
                    switch (variant) {
                        case 1 -> bank1.add();
                        case 2 -> bank1.deleteFromSum();
                        case 3 -> bank1.showInformation();
                        case 0 -> System.exit(0);
                    }
                }
                case 0 -> System.exit(0);
            }
        }
    }
}