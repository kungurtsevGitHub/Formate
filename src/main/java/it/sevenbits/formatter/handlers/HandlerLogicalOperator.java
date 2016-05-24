package main.java.it.sevenbits.formatter.handlers;

/**
 * Created by igor on 20.05.16.
 */
public class HandlerLogicalOperator implements IHandler {
    public static IHandler Instance() {
        return new HandlerLogicalOperator();
    }

    public String handling(final char symbol) {
        char[] strResult = {symbol, ' '};
        String str = new String(strResult);
        return str;
    }
}
