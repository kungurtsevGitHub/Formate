package main.java.it.sevenbits.formatter.streams.outputStream;

import main.java.it.sevenbits.formatter.streams.inputOutputExceptions.ReadWriteException;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Writes to file
 */
public class FlWriter implements IWriter {
    private FileOutputStream fileWriter;

    /**
     * Constructor which intializes fileWriter
     * @param fWriter FileOutputStream
     */
    public FlWriter(final FileOutputStream fWriter) {
            fileWriter = fWriter;
    }

    /**
     * Writes symbol to file
     * @param symbol char
     * @throws ReadWriteException is IOException
     */
    public void writeSymbol(final char symbol)throws ReadWriteException {
        try {
            fileWriter.write((int) symbol);
        } catch (IOException ex) {
            throw new ReadWriteException("Output exception");
        }
    }

    /**
     * Writes String ti file
     * @param str String
     * @throws ReadWriteException is IOException
     */
    public void writeString(final String str) throws ReadWriteException {
        try {
            byte[] buffer = str.getBytes();
            fileWriter.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            throw new ReadWriteException("Output exception");
        }
    }

    /**
     * Closes stream fileWriter
     * @throws ReadWriteException is IOException
     */
    @Override
    public void close() throws ReadWriteException {
        try {
            fileWriter.close();
        } catch (IOException ex) {
            throw new ReadWriteException("Close exception");
        }
    }
}
