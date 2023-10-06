package Homework11;

import java.io.*;
import java.util.Scanner;

public class Homework11 {
        private static final String VALID_FILE_PATH = "IsValid.txt";
        private static final String INVALID_FILE_PATH = "IsNotValid.txt";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter file direction: ");
            String inputFilePath = scanner.nextLine();
            processDocumentNumbers(inputFilePath);
        }

        private static void processDocumentNumbers(String inputFilePath) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))){
                BufferedWriter isValidWriter = new BufferedWriter(new FileWriter(VALID_FILE_PATH));
                BufferedWriter isNotValidWriter = new BufferedWriter(new FileWriter(INVALID_FILE_PATH));
                String line;

                while((line = reader.readLine()) != null){
                    line = line.trim();
                    String validationResult = isValidDocumentNumber(line);

                    if(validationResult.startsWith("Valid")){
                        System.out.println("Document is valid: "+ line);
                        isValidWriter.write(validationResult);
                        isValidWriter.newLine();
                    }
                    else{
                        System.out.println("Document is not valid: "+ line);
                        isNotValidWriter.write("Invalid document number: " + validationResult);
                        isNotValidWriter.newLine();

                    }

                }
                isValidWriter.close();
                isNotValidWriter.close();
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        public static String isValidDocumentNumber(String documentNumber) {
            if (documentNumber.length() != 15) {
                return documentNumber + " (Incorrect length)";
            }
            if (!(documentNumber.startsWith("docnum") || documentNumber.startsWith("contract"))) {
                return  documentNumber + " (Doesn't start with docnum or contract)";
            }
            return "Valid document number: " + documentNumber;
        }

}