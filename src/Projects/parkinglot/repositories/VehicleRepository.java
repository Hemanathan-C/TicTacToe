package Projects.parkinglot.repositories;

import Projects.parkinglot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    Map<String, Vehicle> vehicleMap = new HashMap<>();
    public Vehicle getVehicleByNumber(String vehicleNumber){
        if (vehicleMap.containsKey(vehicleNumber)){
            return vehicleMap.get(vehicleNumber);
        }
        return null;
    }
}
