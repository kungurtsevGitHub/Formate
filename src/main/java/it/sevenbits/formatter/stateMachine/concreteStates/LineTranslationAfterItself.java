package main.java.it.sevenbits.formatter.stateMachine.concreteStates;

import main.java.it.sevenbits.formatter.stateMachine.InterfaceState;
import main.java.it.sevenbits.formatter.stateMachine.InterfaceStateMachine;

/**
 * Created by igor on 15.05.16.
 */
public class LineTranslationAfterItself implements InterfaceState {
    public static InterfaceState Instance() {
        return new LineTranslationAfterItself();
    }

    public void transition(final InterfaceStateMachine stateMachine, final char symbol) {

    }

    @Override
    public String toString() {
        return "LineTranslationAfterItself";
    }
}
