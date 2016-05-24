package main.java.it.sevenbits.formatter.streams.outputStream;

import main.java.it.sevenbits.formatter.streams.inputOutputExceptions.ReadWriteException;


/**
 * abstract class presents streams input abstraction
 */
public interface IWriter extends AutoCloseable {
    /**
     * Writes symbol
     * @param symbol char
     * @throws ReadWriteException is IOException
     */
    void writeSymbol(char symbol)throws ReadWriteException;

    /**
     * Writes string
     * @param str String
     * @throws ReadWriteException is IOException
     */
    void writeString(String str)throws ReadWriteException;

    /**
     * Close stream
     * @throws ReadWriteException is IOException
     */
    //void close() throws ReadWriteException;
}
