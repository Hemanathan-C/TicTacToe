package Projects.parkinglot.dtos;

import Projects.parkinglot.models.Ticket;

public class TicketResponse {
    private ResponseStatus responseStatus;
    private String message;
    private Ticket ticket;

    public TicketResponse(Ticket ticket, ResponseStatus responseStatus, String message) {
        this.responseStatus = responseStatus;
        this.message = message;
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
