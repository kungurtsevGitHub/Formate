package main.java.it.sevenbits.formatter.tableHandlers;

import main.java.it.sevenbits.formatter.handlers.IHandler;

/**
 * Created by igor on 21.05.16.
 */
public interface ITableHandlers {
    void hash();
    boolean containsKey(String key);
    IHandler get(String key);
}
