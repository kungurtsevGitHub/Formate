package main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits;

import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits.InterfaceTableTransits;

/**
 * Created by igor on 22.05.16.
 */
public interface IMapTablesTransits {
    void hash(InterfaceTableTransits tableTransits, InterfaceTableTransits tableTransitsEmptySymbol, InterfaceTableTransits tableTransitsLineTranslation);
    boolean containsKey(String key);
    InterfaceTableTransits get(String key);
}
