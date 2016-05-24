package main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits;

import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits.InterfaceTableTransits;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by igor on 22.05.16.
 */
public class MapTablesTransits implements IMapTablesTransits {
    private Map<String, InterfaceTableTransits> table;

    public MapTablesTransits() {
        table = new HashMap<String, InterfaceTableTransits>();
    }

    public void hash(final InterfaceTableTransits tableTransits, final InterfaceTableTransits tableTransitsEmptySymbol, final InterfaceTableTransits tableTransitsLineTranslation) {
        table.put("ArithmeticalOperator", tableTransits);
        table.put("ArithmeticalOperatorAfterEmptySymbol", tableTransits);
        table.put("BktClose", tableTransitsEmptySymbol);
        table.put("BktOpen", tableTransits);
        table.put("BktOpenAfterEmptySymbol", tableTransits);
        table.put("BraceClose", tableTransitsLineTranslation);
        table.put("BraceCloseAfterLineTranslation", tableTransitsLineTranslation);
        table.put("BraceOpen", tableTransits);
        table.put("BraceOpenAfterEmptySymbol", tableTransits);
        table.put("EmptySymbol", tableTransitsEmptySymbol);
        table.put("EmptySymbolAfterEmptySymbol", tableTransitsEmptySymbol);
        table.put("LineTranslation", tableTransitsLineTranslation);
        table.put("LineTranslationAfterItself", tableTransitsLineTranslation);
        table.put("LogicalOperator", tableTransitsEmptySymbol);
        table.put("Semicolon", tableTransitsLineTranslation);
        table.put("SimpleSymbol", tableTransits);
        table.put("StateStart", tableTransits);
    }

    public boolean containsKey(final String key) {
        return table.containsKey(key);
    }

    public InterfaceTableTransits get(final String key) {
        return table.get(key);
    }

}
