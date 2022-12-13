abstract class Ticket {

    public abstract Ticket ticketBooking();
}

class GeneralTicket extends Ticket {
    public GeneralTicket ticketBooking() {
        System.out.println("");
        return new GeneralTicket();

    }
}

class TatkalTicket extends Ticket {
    public TatkalTicket ticketBooking() {
        System.out.println("");
        return new TatkalTicket();
    }

    class OverRidingDemo5 {
        public static void main(String[] args) {
            Ticket t1 = Factory.getTicketObject("General");
            t1.ticketBooking();
        }
    }

}
