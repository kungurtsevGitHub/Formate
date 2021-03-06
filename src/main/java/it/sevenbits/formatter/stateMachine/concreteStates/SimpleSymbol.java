package main.java.it.sevenbits.formatter.stateMachine.concreteStates;

import main.java.it.sevenbits.formatter.stateMachine.InterfaceState;
import main.java.it.sevenbits.formatter.stateMachine.InterfaceStateMachine;

/**
 * Created by igor on 12.05.16.
 */
public class SimpleSymbol implements InterfaceState {

    public static InterfaceState Instance() {
        return new SimpleSymbol();
    }

    public void transition(final InterfaceStateMachine stateMachine, final char symbol) {

    }

    @Override
    public String toString() {
        return "SimpleSymbol";
    }
}
