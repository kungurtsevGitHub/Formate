package main.java.it.sevenbits.formatter.streams.inputStream;

import main.java.it.sevenbits.formatter.streams.inputOutputExceptions.ReadWriteException;


/**
 * Abstraction of stream output
 */
public interface IReader extends AutoCloseable {
    /**
     * Reads symbol
     * @return char
     * @throws ReadWriteException
     */
    char readSymbol() throws ReadWriteException;

    /**
     *
     * @return true is stream has got unread data
     * @throws ReadWriteException
     */
    boolean hasNext() throws ReadWriteException;

    /**
     * Closes stream
     * @throws ReadWriteException
     */
    //void close() throws ReadWriteException;
}
