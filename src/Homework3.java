import java.util.Arrays;
import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int variant;
        System.out.println("Enter numbers of task\n " +
                "1 - Number in/out of array \n 2 - Delete number \n 3- Random numbers \n 4 - Average of 2 arrays " +
                "\n 5 -Even numbers from first array \n 6 - Odd index = 0\n 7 -Names \n 8 -Bubble sort \n" );
        variant = scan.nextInt();
        switch (variant) {
            case 1 -> {
                int numberToFind;
                int size;
                boolean isInArr = false;
                System.out.println("Enter numbers of array");
                size = scan.nextInt();
                int[] a = new int [size];
                for(int i = 0; i < size; i++) {
                    a[i] = (int) (Math.random() * 100);
                }
                System.out.println("Array is: " + Arrays.toString(a));
                System.out.println("Enter number you want to find: ");
                numberToFind = scan.nextInt();
                for (int currentElement : a) {
                    if (numberToFind == currentElement) {
                        isInArr = true;
                        break;
                    }
                }
                if(isInArr){
                    System.out.println("Number is in mas");
                } else {
                    System.out.println("Number is not in mas");
                }
            }
            case 2 -> {
                int count = 0;
                int deleteNum;
                int size;
                System.out.println("Enter count of elements in array");
                size = scan.nextInt();
                int[] a = new int [size];
                for(int i = 0; i < size; i++) {

                    int randNum = (int) (Math.random() * 100);
                    a[i] = randNum;
                }
                System.out.println("Result: " + Arrays.toString(a));
                System.out.println("Enter number");
                deleteNum = scan.nextInt();
                for (int currentElement : a) {
                    if (deleteNum == currentElement) {
                        count++;
                        int[] resultMas = new int[a.length - count];
                        int index = 0;
                        for (int j : a) {
                            if (j != deleteNum) {
                                resultMas[index] = j;
                                index++;
                            }
                        }
                        System.out.println("Result: " + Arrays.toString(resultMas));
                    }
                }
                if (count == 0) {
                    System.out.println("Number are not in mas " + Arrays.toString(a));
                }
            }
            case 3 -> {
                double avg;
                int sum = 0;
                int size;
                System.out.println("Enter count of elements in array");
                size = scan.nextInt();
                int[] a = new int [size];
                for(int i = 0; i < size; i++) {
                    int randNum = (int) (Math.random() * 100);
                    a[i] = randNum;
                }
                System.out.println("Massive is: " + Arrays.toString(a));
                int max = a[0];
                int min = a[0];
                for(int i = 1; i < a.length; i++) {

                    if (a[i] > max) {
                        max = a[i];
                    }
                    if (a[i] < min) {
                        min = a[i];
                    }
                    sum += a[i];
                }
                avg = (double) sum / size;
                System.out.println("Max number is " + max);
                System.out.println("Max number is " + min);
                System.out.println("Average number is " + avg);
            }
            case 4 -> {
                double averageFirst;
                double averageSecond;
                int sumFirst = 0;
                int sumSecond = 0;
                int[] masFirst = new int [5];
                int[] masSecond = new int [5];
                for(int i = 0; i < masFirst.length; i++) {
                    for (int j = 0; j < masFirst.length; j++) {
                        int randNum = (int) (Math.random() * 100);
                        masFirst[i] = randNum;
                        masSecond[j] = randNum;
                    }
                }
                System.out.println("Massive is: " + Arrays.toString(masFirst));
                System.out.println("Massive is: " + Arrays.toString(masSecond));
                for(int i = 1; i < masFirst.length; i++) {
                    sumFirst += masFirst[i];
                    sumSecond += masSecond[i];
                }
                averageFirst = (double) sumFirst / masFirst.length;
                averageSecond = (double) sumSecond / masSecond.length;
                if(averageFirst > averageSecond) {
                    System.out.println("Average value 1: " + averageFirst +
                            " > than average value 2: " + averageSecond );
                } else if(averageFirst < averageSecond){
                    System.out.println("Average value 1 < than average value 2 ");
                } else if(averageFirst == averageSecond){
                    System.out.println("Average value 1 = average value 2 ");
                }

            }
            case 5 -> {
                int size;
                System.out.println("Enter count of elements from 5 to 10");
                size = scan.nextInt();
                while(size < 5 || size > 10){
                    System.out.println("Wrong input try again");
                    size = scan.nextInt();
                }
                int[] a = new int [size];
                int count = 0;
                for(int i = 0; i < size; i++) {
                    int randNum = (int) (Math.random() * 100);
                    a[i] = randNum;
                }
                System.out.println("Massive is: " + Arrays.toString(a));

                for(int i = 0; i < size; i++) {
                    if(a[i] % 2 != 0){
                        count++;
                    }
                }
                int[] b = new int [count];
                if(count == 0) {
                    System.out.println("There is no such elements");
                } else {
                    int newCounter = 0;
                    for (int j = 0; j < size; j++) {
                        if (a[j] % 2 != 0) {
                            b[newCounter++] = a[j];
                        }
                    }
                }
                System.out.println("Result array is: " + Arrays.toString(b));
            }
            case 6 -> {
                int size;
                System.out.println("Enter count of elements in array");
                size = scan.nextInt();
                int[] array = new int[size];
                for (int i = 0; i < size; i++) {
                    int randNum = (int) (Math.random() * 100);
                    array[i] = randNum;
                }
                for (int i = 0; i < size; i++) {
                    if (i % 2 != 0) {
                        array[i] = 0;
                    }
                }
                System.out.println("Result array is: " + Arrays.toString(array));
            }

            case 7 -> {
                String [] names = new String[]{"Olga", "Kate", "Michail", "Ilya", "Pavel", "Marta"};
                System.out.println("Names: " + Arrays.toString(names));
                Arrays.sort(names);
                System.out.println("Names: " + Arrays.toString(names));
            }

            case 8 -> {
                int size;
                System.out.println("Enter count of elements in array ");
                size = scan.nextInt();
                int[] array = new int [size];
                for(int i = 0; i < size; i++) {
                    int randNum = (int) (Math.random() * 100);
                    array[i] = randNum;
                }
                System.out.println("Array is: " + Arrays.toString(array));

                for(int i = 0; i < size; i++){
                    for(int j = 0; j < size - 1 - i; j++){
                        if(array[j] > array[j+1]) {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
                    }
                }
                System.out.println("Sorted array: " + Arrays.toString(array));

            }
        }
    }
}