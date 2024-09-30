package lldmodule3.parkinglot.repository;

import lldmodule3.parkinglot.exception.ParkingLotDoesNotExistException;
import lldmodule3.parkinglot.model.ParkingLot;

import java.util.HashMap;
//TODO : make all repositories singleton -> repository or DAO[Data Access Object] are the same thing
public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotMap;
    private static int counter = 1;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot save(ParkingLot parkingLot){
        parkingLot.setId(counter++);
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        return parkingLotMap.get(parkingLot.getId());
    }

    public ParkingLot findById(int parkingLotId){
        if(parkingLotMap.containsKey(parkingLotId)){
            return parkingLotMap.get(parkingLotId);
        } else {
            throw new ParkingLotDoesNotExistException("Parking Lot Does not Exist");
        }
    }

    public ParkingLot update(int parkingLotId, ParkingLot newParkingLot){
        if(parkingLotMap.containsKey(parkingLotId)){
            return parkingLotMap.put(parkingLotId, newParkingLot);
        } else {
            throw new ParkingLotDoesNotExistException("Parking Lot Does not Exist");
        }
    }

    public void delete(int parkingLotId){
        if(parkingLotMap.containsKey(parkingLotId)){
            parkingLotMap.remove(parkingLotId);
        } else {
            throw new ParkingLotDoesNotExistException("Parking Lot Does not Exist");
        }
    }
}
