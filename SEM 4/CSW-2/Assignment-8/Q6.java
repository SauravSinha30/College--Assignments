class SeatBooking {
    private int availableSeats = 5;

    public void bookSeat(String threadName, int seatsToBook) {
        System.out.println(threadName + " trying to book " + seatsToBook + " seat(s)");

        synchronized (this) {
            if (availableSeats >= seatsToBook) {
                System.out.println(threadName + " booking " + seatsToBook + " seat(s)...");
                availableSeats -= seatsToBook;
                System.out.println(threadName + " successfully booked. Seats left: " + availableSeats);
            } else {
                System.out.println(threadName + " failed to book. Not enough seats available.");
            }
        }
    }
}

class BookingThread extends Thread {
    private SeatBooking bookingSystem;
    private int seatsToBook;

    public BookingThread(SeatBooking bookingSystem, int seatsToBook, String name) {
        super(name);
        this.bookingSystem = bookingSystem;
        this.seatsToBook = seatsToBook;
    }

    public void run() {
        bookingSystem.bookSeat(getName(), seatsToBook);
    }
}

public class Q6 {
    public static void main(String[] args) {
        SeatBooking bookingSystem = new SeatBooking();

        // Creating multiple threads trying to book seats
        BookingThread t1 = new BookingThread(bookingSystem, 2, "Thread-1");
        BookingThread t2 = new BookingThread(bookingSystem, 3, "Thread-2");
        BookingThread t3 = new BookingThread(bookingSystem, 2, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
