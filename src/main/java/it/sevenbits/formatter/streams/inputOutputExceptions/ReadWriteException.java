package main.java.it.sevenbits.formatter.streams.inputOutputExceptions;

/**
 * Wraps IOException, FileNotFounException
 */
public class ReadWriteException extends Exception  {
    /**
     * Transfers message to Exceptions constructor
     * @param message
     */
    public ReadWriteException(final String message) {
        super(message);
    }
}
