package Projects.parkinglot.strategies;

import Projects.parkinglot.exceptions.ParkingLotFullException;
import Projects.parkinglot.models.ParkingSlot;
import Projects.parkinglot.models.VehicleType;

public class ParkingSlotAllotmentStrategyFactory{
    public static ParkingPlaceAllotmentStrategy getParkingAllotmentStrategyForType(ParkingPlaceAllotmentStrategy parkingPlaceAllotmentStrategy){
        return new SimpleParkingSlotAllotStrategy();
    }

}
