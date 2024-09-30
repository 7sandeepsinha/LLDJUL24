package lldmodule3.parkinglot.exception;

public class ParkingLotDoesNotExistException extends RuntimeException {
    public ParkingLotDoesNotExistException() {
    }

    public ParkingLotDoesNotExistException(String message) {
        super(message);
    }
}
