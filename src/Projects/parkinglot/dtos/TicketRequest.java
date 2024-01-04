package Projects.parkinglot.dtos;

import Projects.parkinglot.models.VehicleType;

public class TicketRequest {
    private VehicleType vehicleType;
    private String VehicleNumber;
    private String ownerName;
    private Long gateId;
    private Long parkinglotId;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public Long getParkinglotId() {
        return parkinglotId;
    }

    public void setParkinglotId(Long parkinglotId) {
        this.parkinglotId = parkinglotId;
    }
}
