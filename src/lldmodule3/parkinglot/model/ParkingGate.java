package lldmodule3.parkinglot.model;

import lldmodule3.parkinglot.model.constant.ParkingGateType;

public class ParkingGate {
    private int id;
    private String gateNumber;
    private ParkingGateType parkingGateType;
    private ParkingAttendant parkingAttendant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public ParkingGateType getParkingGateType() {
        return parkingGateType;
    }

    public void setParkingGateType(ParkingGateType parkingGateType) {
        this.parkingGateType = parkingGateType;
    }

    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }

    public void setParkingAttendant(ParkingAttendant parkingAttendant) {
        this.parkingAttendant = parkingAttendant;
    }
}
