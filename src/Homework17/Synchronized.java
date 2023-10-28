package Homework17;
import java.util.LinkedList;
import java.util.Queue;

public class Synchronized {
    private final Queue<Integer> buffer;
    private final int capacity;

    public Synchronized(int capacity) {
        this.capacity = capacity;
        buffer = new LinkedList<>();
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notify();
    }
}