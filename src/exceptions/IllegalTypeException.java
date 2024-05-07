package src.exceptions;

public class IllegalTypeException extends RuntimeException {
    public <T> IllegalTypeException(T type) {
        super("Our programm does not operate on this type: " + type.toString());
    }
}
