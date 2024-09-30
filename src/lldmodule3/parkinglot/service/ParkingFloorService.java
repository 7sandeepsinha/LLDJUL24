package lldmodule3.parkinglot.service;

import lldmodule3.parkinglot.model.ParkingFloor;
import lldmodule3.parkinglot.model.ParkingSpot;
import lldmodule3.parkinglot.model.constant.ParkingSpotType;
import lldmodule3.parkinglot.model.constant.VehicleType;
import lldmodule3.parkinglot.repository.ParkingFloorRepository;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloorService {

    private ParkingSpotService parkingSpotService;
    private ParkingFloorRepository parkingFloorRepository;

    public ParkingFloorService(ParkingSpotService parkingSpotService, ParkingFloorRepository parkingFloorRepository) {
        this.parkingSpotService = parkingSpotService;
        this.parkingFloorRepository = parkingFloorRepository;
    }

    public ParkingFloor create(int floorNumber,
                               int noOfSpots,
                               ParkingSpotType parkingSpotType,
                               VehicleType vehicleType){
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for(int i=1;i<=noOfSpots;i++){
            parkingSpots.add(parkingSpotService.create((floorNumber * 100 + i), parkingSpotType, vehicleType));
        }
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setFloorNumber(floorNumber);
        parkingFloor.setParkingSpots(parkingSpots);

        return parkingFloorRepository.save(parkingFloor);
    }
}
// floor 1
// 5 spots

// 101, 102, 103, 104, 105