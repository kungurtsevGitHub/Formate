package main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits;

import main.java.it.sevenbits.formatter.stateMachine.InterfaceState;
import main.java.it.sevenbits.formatter.stateMachine.concreteStates.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by igor on 22.05.16.
 */
public class TableTransitsEmptySymbol implements InterfaceTableTransits {
    private Map<String, InterfaceState> table;

    public TableTransitsEmptySymbol() {
        table = new HashMap<String, InterfaceState>();
    }

    public void hash() {
        table.put("(", BktOpenAfterEmptySymbol.Instance());
        table.put(")", BktClose.Instance());
        table.put(";", Semicolon.Instance());
        table.put("{", BraceOpenAfterEmptySymbol.Instance());
        table.put("}", BraceClose.Instance());
        table.put("+", ArithmeticalOperatorAfterEmptySymbol.Instance());
        table.put("-", ArithmeticalOperatorAfterEmptySymbol.Instance());
        table.put("*", ArithmeticalOperatorAfterEmptySymbol.Instance());
        table.put("/", ArithmeticalOperatorAfterEmptySymbol.Instance());
        table.put("%", ArithmeticalOperatorAfterEmptySymbol.Instance());
        table.put("=", ArithmeticalOperatorAfterEmptySymbol.Instance());
        table.put("!", LogicalOperator.Instance());
        table.put("<", LogicalOperator.Instance());
        table.put(">", LogicalOperator.Instance());
        table.put("&", LogicalOperator.Instance());
        table.put("|", LogicalOperator.Instance());
        table.put(" ", EmptySymbolAfterEmptySymbol.Instance());
        table.put("\n", LineTranslation.Instance());
    }

    public boolean containsKey(final String key) {
        return table.containsKey(key);
    }

    public InterfaceState get(final String key) {
        return table.get(key);
    }
}
