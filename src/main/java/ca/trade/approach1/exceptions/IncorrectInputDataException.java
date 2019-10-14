package ca.trade.approach1.exceptions;

public class IncorrectInputDataException extends RuntimeException {
    public IncorrectInputDataException(String message, Throwable t) {
        super(message, t);
    }
}
