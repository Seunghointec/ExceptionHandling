package be.intecbrussel.rectangleDemo.Exception;

public class NegativeLengthException extends Exception{

    //a message is written for the exception on app
    public NegativeLengthException() {
        this("a negative length is not possible");
    }

    public NegativeLengthException(String message) {
        super(message);
    }

    public NegativeLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeLengthException(Throwable cause) {
        super(cause);
    }

    public NegativeLengthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
