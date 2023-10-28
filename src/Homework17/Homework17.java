package Homework17;

import java.util.Scanner;

public class Homework17 {
    public static void taskFirst(){
        Thread t1 = new myThread(" T1 ");
        Thread t2 = new myThread(" T2 ");
        Thread t3 = new myThread(" T3 ");

        try {
            t3.start();
            t3.join();
            t2.start();
            t2.join();
            t1.start();
            t1.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    public static void taskSecond() {
        ReentLock buffer = new ReentLock(11);
        Runnable producer = () -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    buffer.produce(i);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Runnable consumer = () -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    buffer.consume();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void taskThird() {
        Synchronized buffer = new Synchronized(11);
        Runnable producer = () -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    buffer.produce(i);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Runnable consumer = () -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    buffer.consume();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of task:");
            int task = sc.nextInt();
            switch (task) {
                case 1 -> taskFirst();
                case 2 -> taskSecond();
                case 3 -> taskThird();
            }
        }
    }
}