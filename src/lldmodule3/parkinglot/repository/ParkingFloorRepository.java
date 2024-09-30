package lldmodule3.parkinglot.repository;

import lldmodule3.parkinglot.exception.ParkingFloorDoesNotExistException;
import lldmodule3.parkinglot.exception.ParkingSpotDoesNotExistException;
import lldmodule3.parkinglot.model.ParkingFloor;
import lldmodule3.parkinglot.model.ParkingSpot;

import java.util.HashMap;
//TODO : make all repositories singleton -> repository or DAO[Data Access Object] are the same thing
public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingFloorMap;
    private static int counter = 1;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor save(ParkingFloor parkingFloor){
        parkingFloor.setId(counter++);
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        return parkingFloorMap.get(parkingFloor.getId());
    }

    public ParkingFloor findById(int parkingFloorId){
        if(parkingFloorMap.containsKey(parkingFloorId)){
            return parkingFloorMap.get(parkingFloorId);
        } else {
            throw new ParkingFloorDoesNotExistException("Parking Floor Does not Exist");
        }
    }

    public ParkingFloor update(int parkingFloorId, ParkingFloor newParkingFloor){
        if(parkingFloorMap.containsKey(parkingFloorId)){
            return parkingFloorMap.put(parkingFloorId, newParkingFloor);
        } else {
            throw new ParkingFloorDoesNotExistException("Parking Floor Does not Exist");
        }
    }

    public void delete(int parkingFloorId){
        if(parkingFloorMap.containsKey(parkingFloorId)){
            parkingFloorMap.remove(parkingFloorId);
        } else {
            throw new ParkingFloorDoesNotExistException("Parking Floor Does not Exist");
        }
    }
}
