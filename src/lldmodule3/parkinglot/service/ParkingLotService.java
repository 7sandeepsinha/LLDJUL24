package lldmodule3.parkinglot.service;

import lldmodule3.parkinglot.model.ParkingFloor;
import lldmodule3.parkinglot.model.ParkingGate;
import lldmodule3.parkinglot.model.ParkingLot;
import lldmodule3.parkinglot.model.constant.ParkingGateType;
import lldmodule3.parkinglot.model.constant.ParkingSpotType;
import lldmodule3.parkinglot.model.constant.VehicleType;
import lldmodule3.parkinglot.repository.ParkingLotRepository;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotService {

    private ParkingFloorService parkingFloorService;
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingFloorService parkingFloorService, ParkingLotRepository parkingLotRepository) {
        this.parkingFloorService = parkingFloorService;
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot create(String parkingLotName,
                             String address,
                             int numberOfFloor,
                             int entryGates,
                             int exitGates,
                             int spotPerFloor){
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for(int i=1;i<=numberOfFloor;i++){
            parkingFloors.add(
                    parkingFloorService.create(i, spotPerFloor, ParkingSpotType.NORMAL, VehicleType.FOUR_WHEELER)); // TODO -> accept spot Type and vehicle type
        }

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName(parkingLotName);
        parkingLot.setAddress(address);
        parkingLot.setParkingFloors(parkingFloors);

        //TODO: gate creation is hardcoded, update the flow
        ParkingGate entryGate = new ParkingGate();
        entryGate.setGateNumber("Entry-1");
        entryGate.setParkingGateType(ParkingGateType.ENTRY);

        ParkingGate exitGate = new ParkingGate();
        entryGate.setGateNumber("Exit-1");
        entryGate.setParkingGateType(ParkingGateType.EXIT);

        parkingLot.setParkingGates(List.of(entryGate, exitGate));
        return parkingLotRepository.save(parkingLot);
    }
}
