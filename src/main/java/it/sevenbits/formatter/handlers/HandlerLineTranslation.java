package main.java.it.sevenbits.formatter.handlers;

/**
 * Created by igor on 20.05.16.
 */
public class HandlerLineTranslation implements IHandler {
    public static IHandler Instance() {
        return new HandlerLineTranslation();
    }

    public String handling(final char symbol) {
        String str = Character.toString(symbol);
        return str;
    }
}
