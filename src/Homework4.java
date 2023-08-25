import java.util.Random;
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variant;
        System.out.println("""
                Enter numbers of task\s
                 1 - Three-dimensional array \s
                 2 - Chess board\s
                 3- Sum of all elements \s
                 4 - Diagonals \s
                 5 - Sort elements in rows\s
                 6 - Matrix multiplication\s
                """);
        variant = sc.nextInt();
        switch (variant) {
            case 1 -> {
                int numToPlus;
                int layer;
                int row;
                int column;
                System.out.println("Enter count of layers in array ");
                layer = sc.nextInt();
                System.out.println("Enter count of rows in array ");
                row = sc.nextInt();
                System.out.println("Enter count of columns in array ");
                column = sc.nextInt();
                System.out.println("Array is: ");
                int[][][] arr = new int[layer][row][column];
                for (int i = 0; i < layer; i++) {
                    for (int j = 0; j < row; j++) {
                        for (int k = 0; k < column; k++) {
                            arr[i][j][k] = (int) (Math.random() * 10);
                            System.out.print(" " + arr[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println("Enter number  ");
                numToPlus = sc.nextInt();
                System.out.println("Array is: ");
                for (int i = 0; i < layer; i++) {
                    for (int j = 0; j < row; j++) {
                        for (int k = 0; k < column; k++) {
                            arr[i][j][k] = arr[i][j][k] + numToPlus;
                            System.out.print(" " + arr[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                char[][] array = new char[8][8];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        if(i % 2 == 0) {
                            array[i][j] = j % 2 == 0 ? 'W' : 'B';
                        }
                        else {
                            array[i][j] = j % 2 == 1 ? 'W' : 'B';
                        }
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            case 3 -> {
                int row;
                int column;
                System.out.println("Enter count of rows in array ");
                row = sc.nextInt();
                System.out.println("Enter count of columns in array ");
                column = sc.nextInt();
                Random rand = new Random();
                int[][] array = new int [row][column];
                System.out.println("Array is: ");
                for(int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        array[i][j] = rand.nextInt(9);
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println();
                }
                int sum = 0;
                for(int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        sum += array[i][j];
                    }
                }
                System.out.println("Sum is " + sum);
            }
            case 4 -> {
                int row;
                int column;
                System.out.println("Enter count of rows in array ");
                row = sc.nextInt();
                System.out.println("Enter count of columns in array ");
                column = sc.nextInt();
                Random rand = new Random();
                int[][] array = new int[row][column];
                System.out.println("Array is: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        array[i][j] = rand.nextInt(9);
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Main diagonal is: ");
                for (int i = 0; i < row; i++) {
                    System.out.println( array[i][i] + " ");
                }
                System.out.println("Side diagonal is: ");
                for(int i = 0; i < row; i++) {
                    System.out.println(array[i][row - i - 1] + " ");
                }
            }
            case 5 -> {
                int row;
                int column;
                System.out.println("Enter count of elements in array ");
                row = sc.nextInt();
                System.out.println("Enter count of elements in array ");
                column = sc.nextInt();
                Random rand = new Random();
                int[][] array = new int[row][column];
                System.out.println("Array is: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        array[i][j] = rand.nextInt(9);
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println();
                }
                for(int i = 0; i < row; i++) {
                    for (int j = 0; j < column - 1; j++) {
                        for (int k = 0; k < column - 1 - j; k++) {
                            if (array[i][k] > array[i][k + 1]) {
                                int temp = array[i][k];
                                array[i][k] = array[i][k + 1];
                                array[i][k + 1] = temp;
                            }
                        }
                    }
                }
                System.out.println("Array is: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            case 6 -> {
                Random rand = new Random();
                int[][] array = new int[3][3];
                int[][] array2 = new int[3][3];
                System.out.println("Array is: ");
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = rand.nextInt(9);
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Array is: ");
                for (int i = 0; i < array2.length; i++) {
                    for (int j = 0; j < array2[i].length; j++) {
                        array2[i][j] = rand.nextInt(9);
                        System.out.print(" " + array2[i][j] + " ");
                    }
                    System.out.println();
                }
                int[][] res = new int [3][3];
                for (int i = 0; i < res.length; i++) {
                    for (int j = 0; j < res[0].length; j++) {
                        res[i][j] = 0;
                        for (int k = 0; k < array[0].length; k++) {
                            res[i][j] += array[i][k] * array2[k][j];
                        }
                    }
                }
                System.out.println("Array is: ");
                for (int i = 0; i < res.length; i++) {
                    for (int j = 0; j < res[i].length; j++) {
                        System.out.print(" " + res[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}