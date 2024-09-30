package lldmodule3.parkinglot.exception;

public class ParkingSpotNotAvailableException extends RuntimeException{
    public ParkingSpotNotAvailableException() {
    }

    public ParkingSpotNotAvailableException(String message) {
        super(message);
    }
}
