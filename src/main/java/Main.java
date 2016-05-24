package main.java;

import main.java.it.sevenbits.formatter.Format;
import main.java.it.sevenbits.formatter.streams.inputOutputExceptions.ReadWriteException;
import main.java.it.sevenbits.formatter.streams.inputStream.FlReader;
import main.java.it.sevenbits.formatter.streams.inputStream.IReader;
import main.java.it.sevenbits.formatter.streams.inputStream.StringReader;
import main.java.it.sevenbits.formatter.streams.outputStream.FlWriter;
import main.java.it.sevenbits.formatter.streams.outputStream.IWriter;
import main.java.it.sevenbits.formatter.streams.outputStream.StringWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
* Includes main method
* */
public class Main {
    /**
     *
     * @param args String[]
     * main method
     */
    public static void main(final String[] args) {
        String nameFileIn = ("/home/igor/IdeaProjects/Formatter/src/main/java/Input.txt");
        String nameFileOut = ("/home/igor/IdeaProjects/Formatter/src/main/java/Output.txt");
        String strInput = ("e (f) {sdfaf}\nX");
        if (args.length >= 2) {
            nameFileIn =  args[0];
            nameFileOut = args[1];
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(nameFileIn);
            FileOutputStream fileOutputStream = new FileOutputStream(nameFileOut);
            try (IReader readerFile = new FlReader(fileInputStream);
                 IWriter writerFile = new FlWriter(fileOutputStream)) {
                Format formatterFile = new Format();
                formatterFile.formate(readerFile, writerFile);
            }

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
            try (IReader readerStr = new StringReader(strInput);
                IWriter writerConsole = new StringWriter(outputStreamWriter)) {
                Format formatterString = new Format();
                formatterString.formate(readerStr, writerConsole);
            }
        } catch (ReadWriteException ex) {
            System.err.println(ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println("File didn't found");
        } catch (Exception ex) {
            System.err.println("Streams didn't close");
        }

    }
}

