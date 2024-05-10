package Homework14;

import java.util.*;
import java.util.stream.Collectors;

public class Homework14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of task:");
            int task = sc.nextInt();
            switch (task) {

                case 1 -> {
                    List<Integer> arrayList = new ArrayList<>();
                    Random rand = new Random();
                    for (int i = 0; i < 20; i++) {
                        arrayList.add(rand.nextInt(50));
                    }

                    List<Integer> deliteDubl = arrayList.stream().distinct().collect(Collectors.toList());

                    List<Integer> evenEl = deliteDubl.stream().filter(num -> num >= 7 && num <= 17 && num % 2 == 0).collect(Collectors.toList());

                    List<Integer> multOnTwo = deliteDubl.stream().map(num -> num * 2).collect(Collectors.toList());

                    List<Integer> sortEl = deliteDubl.stream().sorted().limit(4).collect(Collectors.toList());

                    long count = arrayList.stream().count();
                    double average = arrayList.stream().mapToInt(Integer::intValue).average().orElse(0.0);

                    System.out.println("ArrList:" + arrayList.toString());
                    System.out.println("1:" + deliteDubl);
                    System.out.println("2:" + evenEl);
                    System.out.println("3:" + multOnTwo);
                    System.out.println("4:" + sortEl);
                    System.out.println("Count:" + count);
                    System.out.println("Average" + average);
                }

                case 2 -> {
                    List<String> students = new ArrayList<>();
                    students.add("Olga");
                    students.add("Kate");
                    students.add("Dmitriy");
                    students.add("Ilya");
                    students.add("Charly");
                    students.add("kate");
                    students.add("Vadim");
                    students.add("Alice");
                    students.add("Bob");
                    students.add("Alex");

                    long countOfMyName = students.stream().filter(name -> name.equalsIgnoreCase("Kate")).count();

                    List<String> startWithA = students.stream().filter(name -> name.toLowerCase().startsWith("a")).toList();

                    Optional<String> firstEl = students.stream().sorted().findFirst();


                    System.out.println("My name:" + countOfMyName);
                    System.out.println("Start with A:" + startWithA);
                    System.out.println("First el:" + firstEl.orElse("Empty"));

                }

            }
        }
    }
}