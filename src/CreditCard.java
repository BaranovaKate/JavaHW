import java.util.Scanner;
public class CreditCard {
    int sum;
    int num;
    Scanner sc = new Scanner(System.in);
    public void addToSum() {
        int numToAdd;
        System.out.println("Enter sum to add");
        numToAdd = sc.nextInt();
        sum += numToAdd;
        System.out.println(sum);
    }
    public void deleteFromSum() {
        int numToDel;
        System.out.println("Enter sum to minus");
        numToDel = sc.nextInt();
        sum -= numToDel;
        System.out.println(sum);
    }
    public void showInformation() {
        System.out.printf("Num %s \t sum %d\n", num, sum);
    }
}