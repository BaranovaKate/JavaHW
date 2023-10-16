package Homework12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Homework12 {


    public static void task2(){
        ArrList<Object> collection = new ArrList<>();
        collection.add(1);
        collection.add("Hello");
        collection.add(451);
        collection.add("Goodbye");

        System.out.println("Element with index 1: ");
        System.out.println(collection.get(1));

        System.out.println("List contains number 451:");
        System.out.println(collection.contains(451));

        System.out.println("Remove Word Hello from the list and tru to find it: ");
        collection.remove("Hello");
        System.out.println(collection.contains("Hello"));

        System.out.println("Clear list and try to get elements: ");
        collection.clear();
        System.out.println(collection.get(0));

    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fileNames = new ArrayList<>();
        System.out.println("Enter file direction. To exit enter 0:");
        while (true) {
            String fileName = sc.nextLine();
            if (fileName.equals("0")) {
                break;
            }
            fileNames.add(fileName);
        }

        HashMap<String, String> documentStatusMap = new HashMap<>();
        HashSet<String> validatedDocuments = new HashSet<>();

        for (String fileName : fileNames) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    String documentNumber = line.trim();
                    if (validatedDocuments.contains(documentNumber)) {
                        continue;
                    }

                    String status = validateDocumentNumber(documentNumber);
                    documentStatusMap.put(documentNumber, status);

                    if ("Valid".equals(status)) {
                        validatedDocuments.add(documentNumber);
                    }
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }

        try {
            PrintWriter reportWriter = new PrintWriter("report.txt");
            for (Map.Entry<String, String> entry : documentStatusMap.entrySet()) {
                reportWriter.println(entry.getKey() + " - " + entry.getValue());
            }
            reportWriter.close();
            System.out.println("Result is in report.txt.");
        } catch (IOException e) {
            System.out.println("Error when writing to the report file: " + e.getMessage());
        }
    }
    private static String validateDocumentNumber (String documentNumber){
        if (documentNumber.length() != 15) {
            return "Invalid (wrong length)";
        }
        if (documentNumber.startsWith("docnum") || documentNumber.startsWith("contract")) {
            return "Valid";
        }
        return "Invalid (wrong start of the doc)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of task:");
        int task = sc.nextInt();
        switch (task){
            case 1 -> task1();
            case 2 -> task2();
        }

    }
}
