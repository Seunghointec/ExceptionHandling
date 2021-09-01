package be.intecbrussel.rectangleDemo.Exception;

//IllegalArgumentException (a subclass of Exception)
//Sometimes constructors are identical even with a similar subclass
public class NegativeWidthException extends IllegalArgumentException{

    public NegativeWidthException() {
    }

    public NegativeWidthException(String s) {
        super(s);
    }

    public NegativeWidthException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeWidthException(Throwable cause) {
        super(cause);
    }
}
