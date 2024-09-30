package lldmodule3.parkinglot.repository;

import lldmodule3.parkinglot.exception.ParkingSpotDoesNotExistException;
import lldmodule3.parkinglot.model.ParkingSpot;

import java.util.HashMap;
//TODO : make all repositories singleton -> repository or DAO[Data Access Object] are the same thing
public class ParkingSpotRepository {
    private HashMap<Integer, ParkingSpot> parkingSpotMap;
    private static int counter = 1;

    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<>();
    }

    public ParkingSpot save(ParkingSpot parkingSpot){
        parkingSpot.setId(counter++);
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        return parkingSpotMap.get(parkingSpot.getId());
    }

    public ParkingSpot findById(int parkingSpotId){
        if(parkingSpotMap.containsKey(parkingSpotId)){
            return parkingSpotMap.get(parkingSpotId);
        } else {
            throw new ParkingSpotDoesNotExistException("Parking Spot Does not Exist");
        }
    }

    public ParkingSpot update(int parkingSpotId, ParkingSpot newParkingSpot){
        if(parkingSpotMap.containsKey(parkingSpotId)){
            return parkingSpotMap.put(parkingSpotId, newParkingSpot);
        } else {
            throw new ParkingSpotDoesNotExistException("Parking Spot Does not Exist");
        }
    }

    public void delete(int parkingSpotId){
        if(parkingSpotMap.containsKey(parkingSpotId)){
            parkingSpotMap.remove(parkingSpotId);
        } else {
            throw new ParkingSpotDoesNotExistException("Parking Spot Does not Exist");
        }
    }
}
