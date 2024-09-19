package lldmodule3.tictactoe.exception;

public class InvalidBoardSizeException extends RuntimeException{
    public InvalidBoardSizeException() {
    }

    public InvalidBoardSizeException(String message) {
        super(message);
    }
}
