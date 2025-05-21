class Buffer {
    private final int[] buffer;
    private int count = 0; // current number of elements
    private final int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }

    public synchronized void put(int value) throws InterruptedException {
        while (count == capacity) {
            wait(); // buffer full, wait for consumer
        }
        buffer[count++] = value;
        System.out.println("Produced: " + value);
        notify(); // notify consumer
    }

    public synchronized int get() throws InterruptedException {
        while (count == 0) {
            wait(); // buffer empty, wait for producer
        }
        int value = buffer[--count];
        System.out.println("Consumed: " + value);
        notify(); // notify producer
        return value;
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.put(i);
                Thread.sleep(500); // simulate time to produce
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted");
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.get();
                Thread.sleep(800); // simulate time to consume
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted");
        }
    }
}
public class Q8 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(3); // shared buffer with capacity 3

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
