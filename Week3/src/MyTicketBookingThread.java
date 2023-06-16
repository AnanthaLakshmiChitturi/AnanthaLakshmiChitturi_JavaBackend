public class MyTicketBookingThread
{
    public static void main(String[] args)
    {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem(10);

        TicketBookingThread thread1 = new TicketBookingThread(ticketBookingSystem, 3);
        TicketBookingThread thread2 = new TicketBookingThread(ticketBookingSystem, 4);
        TicketBookingThread thread3 = new TicketBookingThread(ticketBookingSystem, 2);
        TicketBookingThread thread4 = new TicketBookingThread(ticketBookingSystem, 3);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Remaining tickets: " + ticketBookingSystem.availableTickets);
    }
}
