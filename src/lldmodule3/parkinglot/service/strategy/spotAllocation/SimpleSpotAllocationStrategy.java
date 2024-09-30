package lldmodule3.parkinglot.service.strategy.spotAllocation;

import lldmodule3.parkinglot.exception.ParkingSpotNotAvailableException;
import lldmodule3.parkinglot.model.ParkingFloor;
import lldmodule3.parkinglot.model.ParkingLot;
import lldmodule3.parkinglot.model.ParkingSpot;
import lldmodule3.parkinglot.model.constant.ParkingSpotStatus;
import lldmodule3.parkinglot.model.constant.ParkingSpotType;
import lldmodule3.parkinglot.model.constant.VehicleType;

import java.util.List;

public class SimpleSpotAllocationStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot getParkingSpot(ParkingLot parkingLot, VehicleType vehicleType, ParkingSpotType parkingSpotType) {
        for(ParkingFloor floor : parkingLot.getParkingFloors()){
            for(ParkingSpot parkingSpot : floor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.FREE)
                && parkingSpot.getVehicleType().equals(vehicleType)
                && parkingSpot.getParkingSpotType().equals(parkingSpotType)){
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotAvailableException("Parking Lot is full");
    }
}
