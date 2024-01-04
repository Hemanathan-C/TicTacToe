package Projects.parkinglot.models;

import Projects.parkinglot.strategies.ParkingPlaceAllotmentStrategy;
import Projects.parkinglot.strategies.BillingStrategy;
import Projects.parkinglot.strategies.ParkingPlaceAllotmentStrategy;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private ParkingPlaceAllotmentStrategy parkingPlaceAllotmentStrategy;
    private BillingStrategy billingStrategy;

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingPlaceAllotmentStrategy getAllotmentStrategy() {
        return parkingPlaceAllotmentStrategy;
    }

    public void setAllotmentStrategy(ParkingPlaceAllotmentStrategy parkingPlaceAllotmentStrategy) {
        this.parkingPlaceAllotmentStrategy = parkingPlaceAllotmentStrategy;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }
}
