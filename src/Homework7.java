import java.util.Scanner;
public class Homework7 {
    public static void phoneTask(){
        Scanner sc = new Scanner(System.in);
        Phone samsung = new Phone(295009514, "Samsung Note 10", 100);
        Phone xiaomi = new Phone();
        Phone iphone = new Phone(294007892, "Iphone 14 Pro", 80);
        System.out.println("Phone 1: ");
        samsung.showInfo();
        System.out.println("Phone 2: ");
        xiaomi.showInfo();
        System.out.println("Phone 3: ");
        iphone.showInfo();
        samsung.recieveCall("Samsung 21 Lite");
        xiaomi.recieveCall("Nokia", 298156712);

        System.out.print("Enter count of phone numbers u want to send message: ");
        int count = sc.nextInt();
        String[] numbers = new String[count];
        System.out.println("Enter phone numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.next();
        }
        xiaomi.sendMessage(numbers);
    }
    public static void clinicTask(){
        Scanner sc = new Scanner(System.in);
        int code;
        System.out.println("Enter code");
        code = sc.nextInt();
        TreatmentPlan treatmentPlan = new TreatmentPlan(code);
        Patient patient = new Patient(treatmentPlan);
        Clinic clinic = new Clinic();
        clinic.treatByCode(patient);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of task:\n" +
                    "1 - Phone\n2 - Clinic\n");
            int variant = sc.nextInt();
            switch (variant) {
                case 1 -> phoneTask();
                case 2 -> clinicTask();
            }
        }
    }
}