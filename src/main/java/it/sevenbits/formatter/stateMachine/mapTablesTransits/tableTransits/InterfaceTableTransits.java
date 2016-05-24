package main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits;

import main.java.it.sevenbits.formatter.stateMachine.InterfaceState;

/**
 * Created by igor on 14.05.16.
 */
public interface InterfaceTableTransits {
    void hash();
    boolean containsKey(String key);
    InterfaceState get(String key);
}
