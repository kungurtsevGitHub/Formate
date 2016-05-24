package main.java.it.sevenbits.formatter.tableHandlers;

import main.java.it.sevenbits.formatter.handlers.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by igor on 21.05.16.
 */
public class TableHadlers  implements ITableHandlers {
    private Map<String, IHandler> table;

    public TableHadlers() {
        table = new HashMap<String, IHandler>();
    }

    public void hash() {
        //for (int index = 0; index < states.length; index++) {
        //    table.put(states[index], handlers[index]);
        //}
        table.put("ArithmeticalOperator", HandlerArithmetical.Instance());
        table.put("ArithmeticalOperatorAfterEmptySymbol", HandlerArithmeticalAfterEmpty.Instance());
        table.put("BktClose", HandlerBktClose.Instance());
        table.put("BktOpen", HandlerBktOpen.Instance());
        table.put("BktOpenAfterEmptySymbol", HandlerBktOpenAfterEmpty.Instance());
        table.put("BraceClose", HandlerBraceClose.Instance());
        table.put("BraceCloseAfterLineTranslation", HandlerBraceCloseAfterLineTrans.Instance());
        table.put("BraceOpen", HandlerBraceOpen.Instance());
        table.put("BraceOpenAfterEmptySymbol", HandlerBraceOpenAfterEmpty.Instance());
        table.put("EmptySymbol", HandlerEmptySymbol.Instance());
        table.put("EmptySymbolAfterEmptySymbol", HandlerEmptySymbolAfterEmpty.Instance());
        table.put("LineTranslation", HandlerLineTranslation.Instance());
        table.put("LineTranslationAfterItself", HandlerLinaTranslationAfterItself.Instance());
        table.put("LogicalOperator", HandlerLogicalOperator.Instance());
        table.put("Semicolon",  HandlerSemicolon.Instance());
        table.put("SimpleSymbol", HandlerSimpleSymbol.Instance());

    }

    public boolean containsKey(final String key) {
        return table.containsKey(key);
    }

    public IHandler get(final String key) {
        return table.get(key);
    }
}

