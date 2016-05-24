package main.java.it.sevenbits.formatter;

import main.java.it.sevenbits.formatter.streams.inputOutputExceptions.ReadWriteException;
import main.java.it.sevenbits.formatter.streams.inputStream.IReader;
import main.java.it.sevenbits.formatter.streams.outputStream.IWriter;

/**
 * abstract class presents class Format
 */
public interface InterfaceFormat {
    /**
     *
     * @throws ReadWriteException is IOException or FileNotFoundException
     * formats string or file
     */
    void formate(IReader reader, IWriter writer) throws ReadWriteException;
}
