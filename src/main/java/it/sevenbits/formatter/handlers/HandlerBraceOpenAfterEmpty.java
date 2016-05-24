package main.java.it.sevenbits.formatter.handlers;

/**
 * Created by igor on 20.05.16.
 */
public class HandlerBraceOpenAfterEmpty implements IHandler {
    public static IHandler Instance() {
        return new HandlerBraceOpenAfterEmpty();
    }

    public String handling(final char symbol) {
        char[] strResult = {symbol, '\n', '\t'};
        String str = new String(strResult);
        return str;
    }
}
