package lldmodule3.parkinglot.service.strategy.spotAllocation;

import lldmodule3.parkinglot.model.ParkingLot;
import lldmodule3.parkinglot.model.ParkingSpot;
import lldmodule3.parkinglot.model.Vehicle;
import lldmodule3.parkinglot.model.constant.ParkingSpotType;
import lldmodule3.parkinglot.model.constant.VehicleType;

public interface SpotAllocationStrategy {
    ParkingSpot getParkingSpot(ParkingLot parkingLot,
                               VehicleType vehicleType,
                               ParkingSpotType parkingSpotType);
}
