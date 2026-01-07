package MovieTicket;

class InvalidTicketNumberException extends Exception {
    InvalidTicketNumberException(String msg) {
        super(msg);
    }
}

// Custom Exception 2
class TicketsSoldOutException extends Exception {
    TicketsSoldOutException(String msg) {
        super(msg);
    }
}
