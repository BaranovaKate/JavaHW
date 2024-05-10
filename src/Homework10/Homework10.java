package Homework10;
import Homework10.Task1.ABC;
import Homework10.Task1.DocumentCheck;
import Homework10.Task1.FiveFiveFive;
import Homework10.Task1.OneATwoB;
import Homework10.Task2.Registration;

import java.util.Scanner;

public class Homework10 {

    public static void CaseOne(){
        String documentNumber = "1234-abc-5678-Xyz-1a2b";
        try {
            DocumentCheck.findABC(documentNumber);
        } catch (ABC e) {
            System.err.println(e.getMessage());
        }

        try {
            DocumentCheck.find555(documentNumber);
            System.out.println("555 Yes");
        } catch (FiveFiveFive e) {
            System.err.println(e.getMessage());
        }

        try {
            DocumentCheck.find1a2b(documentNumber);
            System.out.println("1a2b yes");
        } catch (OneATwoB e) {
            System.err.println(e.getMessage());
        }
    }

    public static void CaseSecond(){
        try {
            Registration.loginPassword("username", "password123", "password123");
            System.out.println("First password is Correct");
            Registration.loginPassword("username", "password123", "password167");
            System.out.println("Second password is Correct");
        } catch (Registration.WrongLoginExeption | Registration.WrongPasswordExeption e) {
            System.out.println(e.getMessage());
        }
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter number of task");
            int task = sc.nextInt();

            switch (task) {
                case 1 -> CaseOne();
                case 2 -> CaseSecond();
            }
        }
    }
}