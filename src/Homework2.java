import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num3;
        int num1;
        int variant;
        int t;
        int color;
        int number;
        int mes;
        float summ;
        System.out.println("Enter number of task:\n 1-Time of the year(switch)\n 2 - Time of the year(if) \n" +
                " 3 - Even/Odd \n 4 - Temperature \n 5 - Rainbow \n 6 - odd num from 1 to 99 \n 7 - nums from 5 to 1 \n" +
                "8 - Sum from 1 to n \n 9 - nums 7 14 ... \n 10 - Nums 0 -5 -10... \n 11 - Kubes from 10 to 20 \n" +
                "12 - Fibonachi \n 13 - Bank \n 14 - Multiplication table ");
        variant = num.nextInt();
        switch (variant) {
            case 1 -> {
                System.out.println("1 - September \n 2 - October \n 3 - November \n 4 - December \n " +
                        "5 - January,\n 6 - february \n 7 - March \n 8 - april, \n 9 - may,\n 10 - june," +
                        "\n 11 - july, \n12 - august");
                num1 = num.nextInt();
                switch (num1) {
                    case 1, 2, 3 -> System.out.println("Autumn");
                    case 4, 5, 6 -> System.out.println("winter");
                    case 7, 8, 9 -> System.out.println("Spring");
                    case 10, 11, 12 -> System.out.println("Summer");
                    default -> System.out.println("Enter correct number");
                }
            }

            case 2 -> {
                System.out.println("1 - September \n 2 - October \n 3 - November \n 4 - December " +
                        "\n 5 - January,\n 6 - february \n 7 - March \n 8 - april, \n 9 - may,\n 10 - june,\n " +
                        "11 - july, \n12 - august");
                num1 = num.nextInt();
                if (num1 == 1 || num1 == 2 || num1 == 3)
                    System.out.println("Autumn");
                else if (num1 == 4 || num1 == 5 || num1 == 6)
                    System.out.println("Winter");
                else if (num1 == 7 || num1 == 8 || num1 == 9)
                    System.out.println("Spring");
                else if (num1 == 10 || num1 == 11 || num1 == 12)
                    System.out.println("Summer");
            }
            case 3 ->
            {
                System.out.println("Enter number");
                num3 = num.nextInt();
                if (num3 % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
            case 4 -> {
                System.out.println("Enter temperature");
                t = num.nextInt();
                if (t > -5){
                    System.out.println("Hot");
                } else if (t > -20) {
                    System.out.println("Norm");
                } else{
                    System.out.println("Cold"); }
            }

            case 5 -> {
                System.out.println("Enter number from 1 to 7");
                color = num.nextInt();
                switch (color){
                    case 1 ->  System.out.println("Red");
                    case 2 ->  System.out.println("Orange");
                    case 3 ->  System.out.println("Yellow");
                    case 4 ->  System.out.println("Green");
                    case 5 ->  System.out.println("light Blue");
                    case 6 ->  System.out.println("Dark blue");
                    case 7 ->  System.out.println("Violet");

                }
            }

            case 6 -> {
                for(int i = 1; i < 99; i++) {
                    System.out.println(i);
                    i++;
                }
            }

            case 7 -> {
                for(int i = 5; i > 0; i--){
                    System.out.println(i);
                }
            }
            case 8 -> {
                int sum = 0;
                System.out.println("Enter number");
                number = num.nextInt();
                for(int i = 1; i < number; i++){
                    sum += i;
                }
                System.out.println(sum);
            }

            case 9 -> {
                int val = 7;
                while(val < 98){
                    System.out.println(val);
                    val += 7;

                }
            }

            case 10 -> {
                int n = 0;
                while(n > -45){
                    if(n  > 0)
                        break;
                    n = n - 5;
                    System.out.println(n);

                }
            }

            case 11 -> {
                int s;
                for(int i = 10; i <= 20; i++) {
                    s = i * i;
                    System.out.println(s);
                }
            }
            case 12 -> {
                int a = 0;
                int b = 1;
                int temp;
                System.out.println( a );
                System.out.println( b );
                for (int i = 0; i < 11; i++) {

                    temp = a + b;
                    a = b;
                    b = temp;
                    System.out.println( temp );
                }
            }

            case 13 -> {
                System.out.println( "Enter mes" );
                mes = num.nextInt();
                System.out.println( "Enter summ" );
                summ = num.nextFloat();

                for (int i = 0; i < mes; i++){
                    summ = (float) (summ + (summ * 0.07));
                    System.out.println( summ );
                }
            }
            case 14 -> {
                for (int i = 1; i < 10; i++){
                    for (int j = 1; j < 10; j++){
                        System.out.println(i + "*" + j + "=" + i * j );
                    }
                }
            }

        }

    }
}