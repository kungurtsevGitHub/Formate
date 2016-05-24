package main.java.it.sevenbits.formatter.handlers;

/**
 * Created by igor on 20.05.16.
 */
public class HandlerLinaTranslationAfterItself implements IHandler {
    public static IHandler Instance() {
        return new HandlerLinaTranslationAfterItself();
    }

    public String handling(final char symbol) {
        String str = new String();
        return str;
    }
}
