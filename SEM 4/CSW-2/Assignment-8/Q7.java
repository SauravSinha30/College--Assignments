class PrimeGenerator extends Thread {
    private int start, end;
    public PrimeGenerator(int start, int end, String name) {
        super(name);
        this.start = start;
        this.end = end;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        System.out.println(getName() + " generating primes from " + start + " to " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(getName() + " found prime: " + i);
            }
        }
    }
}
public class Q7 {
    public static void main(String[] args) {
        int limit = 40; // Change this to any upper limit
        int numberOfThreads = 4;

        int rangeSize = limit / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * rangeSize + 1;
            int end = (i == numberOfThreads - 1) ? limit : (i + 1) * rangeSize;

            PrimeGenerator thread = new PrimeGenerator(start, end, "Thread-" + (i + 1));
            thread.start();
        }
    }
}
