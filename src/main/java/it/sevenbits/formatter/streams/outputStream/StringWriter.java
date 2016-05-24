package main.java.it.sevenbits.formatter.streams.outputStream;

import main.java.it.sevenbits.formatter.streams.inputOutputExceptions.ReadWriteException;

import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Writes to console
 */
public class StringWriter implements IWriter {
    private OutputStreamWriter streamWriter;

    /**
     * Constructor which initializes private parameter OutputStreamWriter streamWriter
     * @param outputStreamWriter OutputStreamWriter
     */
    public StringWriter(final OutputStreamWriter outputStreamWriter) {
        streamWriter = outputStreamWriter;
    }

    /**
     * Writes a symbol to console
     * @param symbol char
     * @throws ReadWriteException is IOException
     */
    public void writeSymbol(final char symbol)throws ReadWriteException {
        try {
            String str = Character.toString(symbol);
            streamWriter.write(str);
        } catch (IOException ex) {
            throw new ReadWriteException("Output exception");
        }
    }

    /**
     * Writes a string ti console
     * @param str String
     * @throws ReadWriteException is IOException
     */
    public void writeString(final String str)throws ReadWriteException {
        try {
            streamWriter.write(str);
        } catch (IOException ex) {
            throw new ReadWriteException("Output exception");
        }
    }

    /**
     * Close stream streamWrite
     * @throws ReadWriteException is IOException
     */
    @Override
    public void close() throws ReadWriteException {
        try {
            streamWriter.close();
        } catch (IOException ex) {
            throw new ReadWriteException("Close exception");
        }
    }


}
