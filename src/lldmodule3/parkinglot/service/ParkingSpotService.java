package lldmodule3.parkinglot.service;

import lldmodule3.parkinglot.model.ParkingSpot;
import lldmodule3.parkinglot.model.constant.ParkingSpotStatus;
import lldmodule3.parkinglot.model.constant.ParkingSpotType;
import lldmodule3.parkinglot.model.constant.VehicleType;
import lldmodule3.parkinglot.repository.ParkingSpotRepository;

public class ParkingSpotService {

    private ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
    // we send all params to service, and create the object in service
    // as the object creation might require some business logic, and all logics
    // should be inside service class
    public ParkingSpot create(int slotNumber,
                              ParkingSpotType parkingSpotType,
                              VehicleType vehicleType){
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setParkingSlotNumber(slotNumber);
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.FREE);
        parkingSpot.setParkingSpotType(parkingSpotType);
        parkingSpot.setVehicleType(vehicleType);
        return parkingSpotRepository.save(parkingSpot);
    }
}
