package Projects.parkinglot.strategies;

import Projects.parkinglot.exceptions.ParkingLotFullException;
import Projects.parkinglot.models.ParkingSlot;
import Projects.parkinglot.models.VehicleType;

public class SimpleParkingSlotAllotStrategy implements ParkingPlaceAllotmentStrategy{
    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId) throws ParkingLotFullException {
        return null;
    }
}
