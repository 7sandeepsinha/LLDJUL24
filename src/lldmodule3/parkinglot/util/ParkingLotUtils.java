package lldmodule3.parkinglot.util;

import lldmodule3.parkinglot.model.ParkingFloor;
import lldmodule3.parkinglot.model.ParkingLot;
import lldmodule3.parkinglot.model.ParkingSpot;
import lldmodule3.parkinglot.model.constant.ParkingSpotStatus;

public class ParkingLotUtils {
    public static void print(ParkingLot parkingLot){
        //TODO : complete the print method

    }

    public static void print(ParkingFloor parkingFloor){

    }

    public static void print(ParkingSpot parkingSpot){
        if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.FREE)){
            System.out.print("____");
        } else if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.OCCUPIED)){
            System.out.println("1234");
        } else {
            System.out.println("OUTX");
        }
    }
}
// ParkingLotService.displayParkingLot() -> ParkingLotUtils.print()
// displayParkingLot -> auth check, all empty checks
