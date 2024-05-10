package Homework7.Phone;

import java.util.Arrays;
public class Phone {
    int number;
    String model;
    double weight;
    public void recieveCall(String model){
        System.out.println("Caller's model of the phone:" + model);
    }
    public void recieveCall(String model, int number){
        System.out.println("Caller's model of the phone:" + model);
        System.out.println("Caller's number:" + number);
    }
    public int getNumber(){
        return number;
    }
    public Phone(int number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){
        number = 4124578;
        model = "Xiaomi 7 ";
        weight = 110;
    }
    public void showInfo(){

        System.out.println("Homework7.Phone.Phone number is " + getNumber());
        System.out.println("Homework7.Phone.Phone model is " + model);
        System.out.println("Homework7.Phone.Phone weight is " + weight);
    }
    public void sendMessage(String... numbers) {
        System.out.println("send message to: " + Arrays.toString(numbers));
    }
}