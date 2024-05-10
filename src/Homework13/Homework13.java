package Homework13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework13 {

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date DD.MM.YYYY");
        String intputDate = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try{
            Date data = dateFormat.parse(intputDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(data);

            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            System.out.println("Day of the week is:" + days[dayOfWeek - 1]);

        }catch (Exception e){
            System.out.println("Invalid date format");
        }
    }

    public static void task2(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();

        int currentDay = calendar.get(Calendar.DAY_OF_WEEK);

        int formulaForTuesday = (Calendar.TUESDAY - currentDay + 7) % 7;
        calendar.add(Calendar.DAY_OF_MONTH, formulaForTuesday);
        Date nextTuesday = calendar.getTime();
        System.out.println("Date is:" + dateFormat.format(nextTuesday));
    }

    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to revers string, enter 2 to find factorial of the number:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                System.out.println("Enter String for revers operation:");
                scanner.nextLine();
                String inputString = scanner.nextLine();

                MyFunctionalInterface<String> reverseOperation = (value) -> new StringBuilder(value).reverse().toString();
                String reversedString = MyOperations.executeOperation(inputString, reverseOperation);

                System.out.println("Revers: " + reversedString);
                break;

            case 2:
                System.out.println("Enter number for factorial operation:");
                int inputValue = scanner.nextInt();

                MyFunctionalInterface<Integer> factorialOperation = (value) -> {
                    int result = 1;
                    for (int i = 2; i <= value; i++) {
                        result *= i;
                    }
                    return result;
                };

                int factorialResult = MyOperations.executeOperation(inputValue, factorialOperation);
                System.out.println("Factorial: " + factorialResult);
                break;

            default:
                System.out.println("Invalid input.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of task");
            int task = sc.nextInt();
            switch (task) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
            }
        }
    }
}