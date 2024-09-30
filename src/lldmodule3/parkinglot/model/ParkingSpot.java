package lldmodule3.parkinglot.model;

import lldmodule3.parkinglot.model.constant.ParkingSpotStatus;
import lldmodule3.parkinglot.model.constant.ParkingSpotType;
import lldmodule3.parkinglot.model.constant.VehicleType;

public class ParkingSpot {
    private int id;
    private int parkingSlotNumber;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingSpotType parkingSpotType;
    private VehicleType vehicleType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public void setParkingSlotNumber(int parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
