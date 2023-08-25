import java.util.Scanner;
public class ATM {
    int numberOf20;
    int numberOf50;
    int numberOf100;
    int sum;
    public ATM(int numberOf20, int countOf50, int countOf100){
        this.numberOf20 = numberOf20;
        this.numberOf50 = countOf50;
        this.numberOf100 = countOf100;
        sum = (countOf100 * 100 + countOf50 * 50 + numberOf20 * 20);
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
        int numToDel;
        int number100 = 0;
        int number50 = 0;
        int number20 = 0;
        boolean check;
        System.out.println("Enter sum u want to take out from account");
        numToDel = sc.nextInt();
        int k = numToDel;
        if(sum < numToDel || numToDel % 10 != 0 || numToDel<0){
            check = false;
        }
        else{
            while(numToDel > 0 ) {
                if (numToDel >= 100 &&numToDel % 100 != 10 &&numToDel % 100 != 30 ) {
                    numToDel -= 100;
                    number100++;
                } else if(numToDel % 100 == 10){
                    numToDel -= 110;
                    number20 += 3;
                    number50++;
                }
                else if (numToDel % 100 == 30 ) {
                    numToDel -= 130;
                    number50++;
                    number20 += 4;
                }
                else if (numToDel >= 50 && numToDel % 50 != 10 && numToDel % 50 != 30) {
                    numToDel -= 50;
                    number50++;
                } else if(numToDel % 50 == 10){
                    numToDel -= 60;
                    number20 += 3;
                }
                else if(numToDel % 50 == 30){
                    numToDel -= 80;
                    number20 += 4;
                } else if (numToDel >= 20) {
                    numToDel -= 20;
                    number20++;
                }
            }
            sum -= k;
            check = true;
        }
        if(!check ){
            System.out.println("error");
        } else {
            System.out.println("Success");
            System.out.println(sum);
            System.out.println("Money is issued in banknotes: ");
            System.out.printf("100: %d \t 50: %d\t 20: %d\n", number100, number50, number20);
        }
    }
    public void showInformation() {
        System.out.println(sum);
    }
}