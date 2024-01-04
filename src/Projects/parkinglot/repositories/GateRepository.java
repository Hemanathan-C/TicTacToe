package Projects.parkinglot.repositories;

import Projects.parkinglot.exceptions.GateNotFoundException;
import Projects.parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<Long, Gate> gates = new HashMap<>();
    public Gate findGateByGateId(Long gateId) throws GateNotFoundException {
        if (gates.containsKey(gateId)){
            return gates.get(gateId);
        }
        throw new GateNotFoundException();
    }
}
