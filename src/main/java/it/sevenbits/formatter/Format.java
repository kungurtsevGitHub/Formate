package main.java.it.sevenbits.formatter;

import main.java.it.sevenbits.formatter.handlers.IHandler;
import main.java.it.sevenbits.formatter.stateMachine.StateMachine;
import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.IMapTablesTransits;
import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.MapTablesTransits;
import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits.InterfaceTableTransits;
import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits.TableTransits;
import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits.TableTransitsEmptySymbol;
import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits.TableTransitsLineTranslation;
import main.java.it.sevenbits.formatter.streams.inputOutputExceptions.ReadWriteException;
import main.java.it.sevenbits.formatter.streams.inputStream.IReader;
import main.java.it.sevenbits.formatter.streams.outputStream.IWriter;
import main.java.it.sevenbits.formatter.tableHandlers.ITableHandlers;
import main.java.it.sevenbits.formatter.tableHandlers.TableHadlers;

/**
 * initializes streams and formats data from them
 */

public class Format implements InterfaceFormat {

    /**
     *
     * @throws ReadWriteException
     * formats data from file or string
     */
    public void formate(final IReader reader, final IWriter writer) throws ReadWriteException {
        ITableHandlers tableHandlers = new TableHadlers();
        tableHandlers.hash();
        InterfaceTableTransits tableTransits = new TableTransits();
        tableTransits.hash();
        InterfaceTableTransits tableTransitsEmptySymbol = new TableTransitsEmptySymbol();
        tableTransitsEmptySymbol.hash();
        InterfaceTableTransits tableTransitsLineTranslation = new TableTransitsLineTranslation();
        IMapTablesTransits mapTablesTransits = new MapTablesTransits();
        mapTablesTransits.hash(tableTransits, tableTransitsEmptySymbol, tableTransitsLineTranslation);
        StateMachine stateMachine = new StateMachine(mapTablesTransits);
        while (reader.hasNext()) {
            String strResult;
            char symbolProcessed = reader.readSymbol();
            stateMachine.transition(symbolProcessed);
            String strActiveState = stateMachine.getActiveState().toString();
            IHandler handler = tableHandlers.get(strActiveState);
            strResult = handler.handling(symbolProcessed);
            writer.writeString(strResult);
        }
    }
}

