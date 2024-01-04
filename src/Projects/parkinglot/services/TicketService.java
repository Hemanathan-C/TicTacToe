package Projects.parkinglot.services;

import Projects.parkinglot.dtos.TicketRequest;
import Projects.parkinglot.exceptions.GateNotFoundException;
import Projects.parkinglot.exceptions.ParkingLotFullException;
import Projects.parkinglot.exceptions.ParkingLotNotFoundException;
import Projects.parkinglot.models.*;
import Projects.parkinglot.repositories.GateRepository;
import Projects.parkinglot.repositories.ParkingLotRepository;
import Projects.parkinglot.repositories.TicketRepository;
import Projects.parkinglot.repositories.VehicleRepository;
import Projects.parkinglot.strategies.ParkingPlaceAllotmentStrategy;
import Projects.parkinglot.strategies.ParkingSlotAllotmentStrategyFactory;

import java.util.Date;
import java.util.UUID;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository=gateRepository;
        this.vehicleRepository=vehicleRepository;
        this.parkingLotRepository=parkingLotRepository;
        this.ticketRepository=ticketRepository;
    }

    public Ticket IssueTicket(TicketRequest ticketRequest) throws GateNotFoundException, ParkingLotNotFoundException, ParkingLotFullException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Gate gate = gateRepository.findGateByGateId(ticketRequest.getGateId());

        ticket.setEntryGate(gate);

        Vehicle vehicle = vehicleRepository.getVehicleByNumber(ticketRequest.getVehicleNumber());
        ticket.setVehicle(vehicle);

        ticket.setParkingSlot(getParkingSlot(ticketRequest));

        ticket.setNumber(ticketRequest.getOwnerName()+ UUID.randomUUID());

        return ticketRepository.save(ticket);

    }
    private Vehicle getVehicleForNumber(TicketRequest ticketRequest){
        Vehicle vehicle = vehicleRepository.getVehicleByNumber(ticketRequest.getVehicleNumber());
        if (vehicle==null){
            vehicle = new Vehicle(ticketRequest.getVehicleType(),ticketRequest
                    .getVehicleNumber(),ticketRequest.getOwnerName());
        }
        return vehicle;
    }
    private ParkingSlot getParkingSlot(TicketRequest ticketRequest) throws ParkingLotNotFoundException, ParkingLotFullException {
        ParkingLot parkingLot = parkingLotRepository.findParkingLotById(ticketRequest.getParkinglotId());
        ParkingPlaceAllotmentStrategy allotmentStrategy = parkingLot.getAllotmentStrategy();
        ParkingPlaceAllotmentStrategy parkingPlaceAllotmentRule =
                ParkingSlotAllotmentStrategyFactory.getParkingAllotmentStrategyForType(allotmentStrategy);
        ParkingSlot parkingSlot =
                parkingPlaceAllotmentRule.getParkingSlot(ticketRequest.getVehicleType(), ticketRequest.getParkinglotId());
        return parkingSlot;
    }
}
