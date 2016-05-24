package main.java.it.sevenbits.formatter.streams.inputStream;

import com.sun.xml.internal.ws.Closeable;


/**
 * Reads from string
 */
public class StringReader implements IReader, Closeable {
    private String inputStream;
    private int position;

    /**
     * Constructor which initializes private inputStream and position
     * @param str String
     */
    public StringReader(final String str) {
        inputStream = str;
        position = 0;
    }

    /**
     * Reads char from inputStream
     * @return char
     */
    public char readSymbol() {
        return inputStream.charAt(position++);
    }

    /**
     *
     * @return true if inputStream has got unread symbols
     */
    public boolean hasNext() {
        return position < inputStream.length();
    }

    /**
     * Closes inputStream
     */
    @Override
    public void close() {
        position = 0;
    }
}
