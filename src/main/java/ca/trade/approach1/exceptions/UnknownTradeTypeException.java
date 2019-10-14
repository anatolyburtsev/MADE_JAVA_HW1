package ca.trade.approach1.exceptions;

public class UnknownTradeTypeException extends RuntimeException {
    public UnknownTradeTypeException(String message) {
        super(message);
    }
}
