package Homework15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework15 {
    private static final Pattern PATTERN = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    public static boolean isValid(String ipAddress){
        return PATTERN.matcher(ipAddress).matches();
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ip address (Формат xxx.xxx.xxx.xxx.Цифр может быть меньше, но не больше. Диапазон каждой части [0 - 255])");
        String ipAddress = sc.nextLine();
        if(isValid(ipAddress)){
            System.out.println("IP is valid");
        } else {
            System.out.println("IP is not valid");
        }

    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter folder path:");
        String folderPath = sc.nextLine();

        System.out.println("Enter number of documents you want to test: ");

        int docCount = sc.nextInt();

        Map<String, Document> docMap = new HashMap<>();

        int invalidDocCount = 0;
        try{
            File folder = new File(folderPath);
            File[] files = folder.listFiles();

            if(files == null || files.length == 0){
                System.out.println("There is not files in this folder");
                return;
            }

            for (int i = 0; i < Math.min(docCount, files.length); i++) {
                File file = files[i];

                if (!file.isFile() || !file.getName().endsWith(".txt")) {
                    continue;
                }

                String fileName = file.getName();
                String documentName = fileName.substring(0, fileName.lastIndexOf('.'));
                String content = Files.readString(Path.of(file.getAbsolutePath()));

                Document document = extractDocumentInfo(content);
                if (document != null) {
                    docMap.put(documentName, document);
                } else {
                    invalidDocCount++;
                }
            }
            System.out.println("Обработка документов завершена.");
            System.out.println("Количество обработанных валидных документов: " + docMap.size());
            System.out.println("Количество невалидных документов: " + invalidDocCount);

        } catch (IOException e){
            System.out.println("Error while reading files" + e.getMessage());
        }

    }

    private static Document extractDocumentInfo(String content) {
        Pattern documentPattern = Pattern.compile("\\b\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d{4}-[a-zA-Zа-яА-Я]{3}-[a-zA-Zа-яА-Я]{2}[a-zA-Zа-яА-Я0-9]\\b");
        Matcher documentMatcher = documentPattern.matcher(content);

        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher phoneMatcher = phonePattern.matcher(content);

        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher emailMatcher = emailPattern.matcher(content);

        if (documentMatcher.find() || phoneMatcher.find() || emailMatcher.find()) {
            String documentNumber = documentMatcher.group();
            String phoneNumber = phoneMatcher.find() ? phoneMatcher.group() : "";
            String email = emailMatcher.find() ? emailMatcher.group() : "";

            return new Document(documentNumber, phoneNumber, email);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter number of task: ");
            int task = sc.nextInt();
            switch (task) {
                case 1 -> task1();
                case 2 -> task2();
                default ->  System.out.println("Error.Enter correct number of task: ");

            }
        }
    }
}