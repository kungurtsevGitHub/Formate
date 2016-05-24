package main.java.it.sevenbits.formatter.streams.inputStream;

import main.java.it.sevenbits.formatter.streams.inputOutputExceptions.ReadWriteException;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Reads from file
 */
public class FlReader implements IReader {
    private FileInputStream fileReader;

    /**
     * initializes fileReader
     * @param fReader
     */
    public FlReader(final FileInputStream fReader) {
        fileReader = fReader;
    }

    /**
     * Reads char from file
     * @return char
     * @throws ReadWriteException
     */
    public char readSymbol() throws ReadWriteException {
        try {
            return (char) fileReader.read();
        } catch (Exception ex) {
            throw new ReadWriteException("Can't read next element");
        }
    }

    /**
     *
     * @return true is stream has got unread data
     * @throws ReadWriteException
     */
    public boolean hasNext() throws ReadWriteException {
        try {
            return fileReader.available() != 0;
        } catch (IOException ex) {
            throw new ReadWriteException("Input exception");
        }
    }

    /**
     * Closes fileReader
     * @throws ReadWriteException
     */
    @Override
    public void close() throws ReadWriteException {
        try {
            fileReader.close();
        } catch (IOException ex) {
            throw new ReadWriteException("Close exception");
        }
    }
}
