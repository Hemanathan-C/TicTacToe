package Projects.parkinglot.models;

import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSlot> parkingSlot;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(List<ParkingSlot> parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
