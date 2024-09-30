package lldmodule3.parkinglot.controller;

import lldmodule3.parkinglot.model.ParkingLot;
import lldmodule3.parkinglot.service.ParkingLotService;

public class ParkingLotController {

    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public ParkingLot create(String parkingLotName,
                             String address,
                             int numberOfFloor,
                             int entryGates,
                             int exitGates,
                             int spotPerFloor){
       //TODO : validate
        /*
            Floor > 0
            Null validations
            entryGate > 0
            exitGate > 0
            spotPerFloor > 10
         */
        return parkingLotService.create(parkingLotName, address, numberOfFloor, entryGates, exitGates, spotPerFloor);
    }
}
