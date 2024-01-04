package Projects.parkinglot.controllers;

import Projects.parkinglot.dtos.ResponseStatus;
import Projects.parkinglot.dtos.TicketRequest;
import Projects.parkinglot.dtos.TicketResponse;
import Projects.parkinglot.exceptions.GateNotFoundException;
import Projects.parkinglot.exceptions.ParkingLotNotFoundException;
import Projects.parkinglot.models.Ticket;
import Projects.parkinglot.services.TicketService;

public class TicketController {
    public static String INVALID_GATE = "Gate is not valid  ";
    public static String TICKET_ISSUED_MESSAGE = "Ticket Issued";
    public static String INVALID_PARKING_LOT = "Pakring Lot is not valid  ";

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponse IssueTicket(TicketRequest ticketRequest){
        Ticket ticket = null;
        try{
            ticket = ticketService.IssueTicket(ticketRequest);
        }
        catch(GateNotFoundException e){
            return new TicketResponse(null, ResponseStatus.FAILURE, INVALID_GATE);
        }
         catch (ParkingLotNotFoundException e) {
            return new TicketResponse(null,ResponseStatus.FAILURE,INVALID_PARKING_LOT);
        }
        return new TicketResponse(ticket, ResponseStatus.SUCCESS, TICKET_ISSUED_MESSAGE);
    }
}
