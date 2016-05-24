package main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits;

import main.java.it.sevenbits.formatter.stateMachine.InterfaceState;
import main.java.it.sevenbits.formatter.stateMachine.concreteStates.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by igor on 14.05.16.
 */
public class TableTransitsLineTranslation implements InterfaceTableTransits {
    private Map<String, InterfaceState> table;

    public TableTransitsLineTranslation() {
        table = new HashMap<String, InterfaceState>();
    }

    public void hash() {
        //for (int index = 0; index < keys.length; index++) {
        //   table.put(keys[index], states[index]);
        //}
        table.put("(", BktOpen.Instance());
        table.put(")", BktClose.Instance());
        table.put(";", Semicolon.Instance());
        table.put("{", BraceOpen.Instance());
        table.put("}", BraceCloseAfterLineTranslation.Instance());
        table.put("+", ArithmeticalOperator.Instance());
        table.put("-", ArithmeticalOperator.Instance());
        table.put("*", ArithmeticalOperator.Instance());
        table.put("/", ArithmeticalOperator.Instance());
        table.put("%", ArithmeticalOperator.Instance());
        table.put("=", ArithmeticalOperator.Instance());
        table.put("!", LogicalOperator.Instance());
        table.put("<", LogicalOperator.Instance());
        table.put(">", LogicalOperator.Instance());
        table.put("&", LogicalOperator.Instance());
        table.put("|", LogicalOperator.Instance());
        table.put(" ", EmptySymbol.Instance());
        table.put("\n", LineTranslationAfterItself.Instance());
    }

    public boolean containsKey(final String key) {
        return table.containsKey(key);
    }

    public InterfaceState get(final String key) {
        return table.get(key);
    }
}
