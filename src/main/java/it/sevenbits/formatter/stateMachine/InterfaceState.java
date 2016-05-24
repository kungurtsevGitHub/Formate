package main.java.it.sevenbits.formatter.stateMachine;

/**
 * Created by igor on 12.05.16.
 */

public interface InterfaceState {
    void transition(InterfaceStateMachine sMachine, char symbol);
}
