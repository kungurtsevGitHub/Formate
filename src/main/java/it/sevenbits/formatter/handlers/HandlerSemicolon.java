package main.java.it.sevenbits.formatter.handlers;

/**
 * Created by igor on 20.05.16.
 */
public class HandlerSemicolon implements IHandler {
    public static IHandler Instance() {
        return new HandlerSemicolon();
    }

    public String handling(final char symbol) {
        char[] strResult = {symbol, '\n'};
        String str = new String(strResult);
        return str;
    }
}
