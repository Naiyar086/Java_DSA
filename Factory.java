class Factory {
    static Ticket getTicketObject(String typeOfTicket) {
        if (typeOfTicket.equalsIgnoreCase("Tatkal")) {
            return new TatkalTicket();
        } else {
            return new GeneralTicket();
        }
    }
}
