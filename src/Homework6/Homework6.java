package Homework6;
import Homework6.Task1.Circle;
import Homework6.Task1.Shape;
import Homework6.Task1.Triangle;
import Homework6.Task1.Rectangle;
import Homework6.Task2.PostName;
import Homework6.Task3.Finance;
import Homework6.Task3.Products;
import Homework6.Task3.Register;
import Homework6.Task3.Staff;
import java.util.Date;
import java.util.Scanner;
public class Homework6 {
    public static void newPeople(){
        PostName director = new PostName() {
            @Override
            public void printName() {
                System.out.println("Director");
            }
        };
        PostName worker = new PostName() {
            @Override
            public void printName() {
                System.out.println("Worker");
            }
        };
        PostName accountant = new PostName() {
            @Override
            public void printName() {
                System.out.println("Accountant");
            }
        };
        director.printName();
        worker.printName();
        accountant.printName();
    }

    public static void shapeTask(){
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(6, 7, 8, 9);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(3);
        shapes[3] = new Triangle(4, 5, 6, 7);
        shapes[4] = new Rectangle(2, 8);
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
            System.out.println("Area: " + shape.calculateArea());
        }
        System.out.println("Total Perimeter: " + totalPerimeter);
    }

    public static void registerTask(){
        Scanner sc = new Scanner(System.in);
        Register register = new Register();

        Products productsFirst = new Products(1, new Date(), "Book", 15);
        Products productsSecond = new Products();

        Finance financeFirst = new Finance(2, new Date(), 12, 45678);
        Finance financeSecond = new Finance();

        Staff staffFirst = new Staff(3, new Date(), new Date(), "Elena Anatolevna");
        Staff staffSecond = new Staff();

        register.saveInfo(productsFirst);
        register.saveInfo(productsSecond);
        register.saveInfo(financeFirst);
        register.saveInfo(financeSecond);
        register.saveInfo(staffFirst);
        register.saveInfo(staffSecond);

        int variant;
        while (true) {
            System.out.println("Enter number of option:\n" +
                    "1 - Information about Doc1.Products(constructor1)\n" +
                    "2 - Information about Doc2.Products(constructor2)\n" +
                    "3 - Information about Doc3.Finance(constructor1)\n" +
                    "4 - Information about Doc4.Finance(constructor2)\n" +
                    "5 - Information about Doc5.Staff(constructor1)\n" +
                    "6 - Information about Doc6.Staff(constructor2)\n" +
                    "7 - If u want to add Doc7.Products\n" +
                    "8 - If u want to add Doc8.Finance\n" +
                    "9 -  If u want to add Doc9.Staff\n");
            variant = sc.nextInt();
            switch (variant) {
                case 1 -> {
                    System.out.println("Doc 1:");
                    register.getInfo(0);
                }
                case 2 -> {
                    System.out.println("Doc 2:");
                    register.getInfo(1);
                }
                case 3 -> {
                    System.out.println("Doc 3:");
                    register.getInfo(2);
                }
                case 4 -> {
                    System.out.println("Doc 4:");
                    register.getInfo(3);
                }
                case 5 -> {
                    System.out.println("Doc 5:");
                    register.getInfo(4);
                }
                case 6 -> {
                    System.out.println("Doc 6:");
                    register.getInfo(5);
                }
                case 7 -> {
                    System.out.println("Num of the Document:");
                    int docNum = sc.nextInt();
                    System.out.println("data:");
                    Date data = new Date(sc.nextLong());
                    System.out.println("type:");
                    String type = sc.next();
                    System.out.println("count:");
                    int countOfProd = sc.nextInt();
                    Products productsNew = new Products(docNum, data, type, countOfProd);
                    register.saveInfo(productsNew);
                    register.getInfo(6);
                }
                case 8 -> {
                    System.out.println("Num of the Document:");
                    int docNum = sc.nextInt();
                    System.out.println("data:");
                    Date date = new Date(sc.nextLong());
                    System.out.println("Final sum:");
                    int finalSum = sc.nextInt();
                    System.out.println("Code of the Department:");
                    int codeOfDepart = sc.nextInt();
                    Finance financeNew = new Finance(docNum, date, finalSum, codeOfDepart);
                    register.saveInfo(financeNew);
                    register.getInfo(7);
                }
                case 9 -> {
                    System.out.println("Num of the Document:");
                    int docNum = sc.nextInt();
                    System.out.println("Date of creation:");
                    Date dataCreation = new Date(sc.nextLong());
                    System.out.println("Date of ending:");
                    Date dataEnd = new Date(sc.nextLong());
                    System.out.println("Staff name:");
                    String name = sc.next();
                    Staff staffNew = new Staff(docNum, dataCreation, dataEnd, name);
                    register.saveInfo(staffNew);
                    register.getInfo(8);
                }
                default -> System.out.println("There is no such document");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of task:\n" +
                    "1 - Shapes\n" +
                    "2 - Workers\n" +
                    "3 - Register");
            int task = sc.nextInt();
            switch (task) {
                case 1 -> shapeTask();
                case 2 -> newPeople();
                case 3 -> registerTask();
            }
        }
    }
}