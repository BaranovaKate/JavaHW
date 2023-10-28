package Homework16;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
import java.util.Scanner;

public class Homework16 {

    public static void tasks() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter path to folder with XML file: ");
            String xmlFolderPath = reader.readLine();
            File folder = new File(xmlFolderPath);

            if (!folder.exists() || !folder.isDirectory()) {
                System.out.println("There is no such folder");
                return;
            }

            File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".xml"));

            if (files == null || files.length == 0) {
                System.out.println("No XML files found in the directory.");
                return;
            }

            if (files.length > 1) {
                System.out.println("More than one XML files found in the directory.");
                return;
            }

            File xmlFile = files[0];

            switch (choice) {
                case 1 -> {
                    try {
                        SAXParserFactory factory = SAXParserFactory.newInstance();
                        SAXParser saxParser = factory.newSAXParser();
                        SAXHandler handler = new SAXHandler();
                        saxParser.parse(xmlFile, handler);

                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(handler.getFilename() + "1.txt"))) {
                            writer.write(handler.getOutput());
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                        String newFileName = handler.getFilename() + "_1.txt";
                        System.out.println("Данные из XML файла записаны в файл " + newFileName);

                    } catch (ParserConfigurationException | SAXException | IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                        Document document = docBuilder.parse(xmlFile);

                        String firstName = document.getElementsByTagName("firstName").item(0).getTextContent();
                        String lastName = document.getElementsByTagName("lastName").item(0).getTextContent();
                        String title = document.getElementsByTagName("title").item(0).getTextContent();

                        NodeList lines = document.getElementsByTagName("line");

                        String newFileName = firstName + "_" + lastName + "_" + title + "_2.txt";
                        File newFile = new File(newFileName);
                        FileWriter writer = new FileWriter(newFile);

                        for (int i = 0; i < lines.getLength(); i++) {
                            Node line = lines.item(i);
                            writer.write(line.getTextContent() + "\n");
                        }

                        writer.close();
                        System.out.println("Данные из XML файла записаны в файл " + newFileName);
                    } catch (ParserConfigurationException | IOException | SAXException e) {
                        System.out.println(e.getMessage());
                    }
                }
                default -> System.out.println("Invalid choice");
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter method: 1 - SAX, 2 - DOM");
            tasks();
        }
    }
}