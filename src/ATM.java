import java.util.Scanner;
public class ATM {
    int numberOf20;
    int numberOf50;
    int numberOf100;
    int sum;
    public ATM(int numberOf20, int numberOf50, int numberOf100){
        this.numberOf20 = numberOf20;
        this.numberOf50 = numberOf50;
        this.numberOf100 = numberOf100;
        sum = (numberOf100 * 100 + numberOf50 * 50 + numberOf20 * 20);
    }
    Scanner sc = new Scanner(System.in);
    public void add () {
        int numToAdd;
        System.out.println("Enter summa u want to put ");
        numToAdd = sc.nextInt();
        sum += numToAdd;
        System.out.println(sum);
    }
    public void deleteFromSum() {
        int toTakeFromAccount;
        int ClientCash100 = 0;
        int ClientCash50 = 0;
        int ClientCash20 = 0;

        boolean check;
        System.out.println("Enter sum u want to take out from account");
        toTakeFromAccount = sc.nextInt();
        int saveNumberToTakeFromAccount = toTakeFromAccount;
        if(sum < toTakeFromAccount || toTakeFromAccount % 10 != 0 || toTakeFromAccount<0){
            check = false;
        }
        else{
            while(toTakeFromAccount > 0 ) {
                if (toTakeFromAccount >= 100 &&toTakeFromAccount % 100 != 10 &&toTakeFromAccount % 100 != 30 ) {
                    toTakeFromAccount -= 100;
                    ClientCash100++;
                } else if(toTakeFromAccount % 100 == 10){
                    toTakeFromAccount -= 110;
                    ClientCash20 += 3;
                    ClientCash50++;
                }
                else if (toTakeFromAccount % 100 == 30 ) {
                    toTakeFromAccount -= 130;
                    ClientCash50++;
                    ClientCash20 += 4;
                }
                else if (toTakeFromAccount >= 50 && toTakeFromAccount % 50 != 10 && toTakeFromAccount % 50 != 30) {
                    toTakeFromAccount -= 50;
                    ClientCash50++;
                } else if(toTakeFromAccount % 50 == 10){
                    toTakeFromAccount -= 60;
                    ClientCash20 += 3;
                }
                else if(toTakeFromAccount % 50 == 30){
                    toTakeFromAccount -= 80;
                    ClientCash20 += 4;
                } else if (toTakeFromAccount >= 20) {
                    toTakeFromAccount -= 20;
                    ClientCash20++;
                }
            }
            sum -= saveNumberToTakeFromAccount;
            check = true;
        }
        if(!check ){
            System.out.println("error");
        } else {
            System.out.println("Success");
            System.out.println(sum);
            System.out.println("Money is issued in banknotes: ");
            System.out.printf("100: %d \t 50: %d\t 20: %d\n", ClientCash100, ClientCash50, ClientCash20);
        }
    }
    public void showInformation() {
        System.out.println(sum);
    }
}