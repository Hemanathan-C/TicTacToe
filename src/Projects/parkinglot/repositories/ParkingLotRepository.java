package Projects.parkinglot.repositories;

import Projects.parkinglot.exceptions.ParkingLotNotFoundException;
import Projects.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
    public ParkingLot findParkingLotById(Long parkingLotId) throws ParkingLotNotFoundException {
        if (parkingLotMap.containsKey(parkingLotId)){
            return parkingLotMap.get(parkingLotId);
        }
        throw new ParkingLotNotFoundException();
    }
}
