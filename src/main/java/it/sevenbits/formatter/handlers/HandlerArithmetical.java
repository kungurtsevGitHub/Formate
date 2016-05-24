package main.java.it.sevenbits.formatter.handlers;

/**
 * Created by igor on 20.05.16.
 */
public class HandlerArithmetical implements IHandler {
    public static IHandler Instance() {
        return new HandlerArithmetical();
    }

    public String handling(final char symbol) {
        char[] strResult = {' ', symbol};
        String str = new String(strResult);
        return str;
    }
}
