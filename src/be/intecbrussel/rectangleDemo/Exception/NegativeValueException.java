package be.intecbrussel.rectangleDemo.Exception;

import be.intecbrussel.rectangleDemo.Exception.NegativeWidthException;

public class NegativeValueException extends NegativeWidthException {

    public NegativeValueException() {
    }

    public NegativeValueException(String message) {
        super(message);
    }

    public NegativeValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeValueException(Throwable cause) {
        super(cause);
    }

    public NegativeValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
