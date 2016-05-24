package main.java.it.sevenbits.formatter.handlers;

/**
 * Created by igor on 20.05.16.
 */
public class HandlerBraceCloseAfterLineTrans implements IHandler {
    public static IHandler Instance() {
        return new HandlerBraceCloseAfterLineTrans();
    }

    public String handling(final char symbol) {
        char[] strResult = {symbol, '\n'};
        String str = new String(strResult);
        return str;
    }
}
