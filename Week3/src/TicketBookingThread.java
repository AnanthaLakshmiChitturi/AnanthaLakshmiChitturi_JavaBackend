import java.util.concurrent.locks.*;

class TicketBookingSystem {
    public int availableTickets;
    public final Lock lock;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
        this.lock = new ReentrantLock();
    }

    public void bookTicket(int requestedTickets) {
        lock.lock();
        try {
            if (availableTickets >= requestedTickets) {
                System.out.println(Thread.currentThread().getName() + " is booking " + requestedTickets + " ticket(s).");
                try {
                    Thread.sleep(1000); // Simulating ticket booking process
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                availableTickets -= requestedTickets;
                System.out.println(Thread.currentThread().getName() + " successfully booked " + requestedTickets + " ticket(s).");
            } else {
                System.out.println(Thread.currentThread().getName() + " could not book " + requestedTickets + " ticket(s). Not enough tickets available.");
            }
        } finally {
            lock.unlock();
        }
    }
}

class TicketBookingThread extends Thread {
    private final TicketBookingSystem ticketBookingSystem;
    private final int requestedTickets;

    public TicketBookingThread(TicketBookingSystem ticketBookingSystem, int requestedTickets) {
        this.ticketBookingSystem = ticketBookingSystem;
        this.requestedTickets = requestedTickets;
    }

    @Override
    public void run() {
        ticketBookingSystem.bookTicket(requestedTickets);
    }
}

