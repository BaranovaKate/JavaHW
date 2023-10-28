package Homework17;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentLock {
    private final Queue<Integer> buffer;
    private final int capacity;
    private final ReentrantLock lock;
    private final Condition notFull;
    private final Condition notEmpty;

    public ReentLock(int capacity) {
        this.capacity = capacity;
        buffer = new LinkedList<>();
        lock = new ReentrantLock();
        notFull = lock.newCondition();
        notEmpty = lock.newCondition();
    }

    public void produce(int item) throws InterruptedException {
        lock.lock();
        try {
            while (buffer.size() == capacity) {
                notFull.await();
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while (buffer.isEmpty()) {
                notEmpty.await();
            }
            int item = buffer.poll();
            System.out.println("Consumed: " + item);
            notFull.signal();
        } finally {
            lock.unlock();
        }
    }
}