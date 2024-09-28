package lldmodule3.tictactoe.exception;

public class InvalidCellChosenException extends RuntimeException{
    public InvalidCellChosenException() {
    }

    public InvalidCellChosenException(String message) {
        super(message);
    }
}
