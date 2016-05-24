package main.java.it.sevenbits.formatter.handlers;

/**
 * Created by igor on 20.05.16.
 */
public class HandlerBraceClose implements IHandler {
    public static IHandler Instance() {
        return new HandlerBraceClose();
    }

    public String handling(final char symbol) {
        char[] strResult = {'\n', symbol, '\n'};
        String str = new String(strResult);
        return str;
    }
}
