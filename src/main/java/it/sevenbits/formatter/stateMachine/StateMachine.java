package main.java.it.sevenbits.formatter.stateMachine;

import main.java.it.sevenbits.formatter.stateMachine.concreteStates.SimpleSymbol;
import main.java.it.sevenbits.formatter.stateMachine.concreteStates.StateStart;
import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.IMapTablesTransits;
import main.java.it.sevenbits.formatter.stateMachine.mapTablesTransits.tableTransits.InterfaceTableTransits;

/**
 * Created by igor on 12.05.16.
 */

public class StateMachine implements InterfaceStateMachine {
    private InterfaceState activeState;
    private IMapTablesTransits mapTablesTransits;

    public StateMachine(final IMapTablesTransits map) {
        this.mapTablesTransits = map;
        this.activeState = StateStart.Instance();
    }

    public void transition(final char symbol) {
        String key = Character.toString(symbol);
        InterfaceTableTransits tableTransitions = mapTablesTransits.get(activeState.toString());
        if (tableTransitions.containsKey(key)) {
            changeActiveState(tableTransitions.get(key));
        } else {
            changeActiveState(SimpleSymbol.Instance());
        }
    }

    private void changeActiveState(final InterfaceState state) {
        this.activeState = state;
    }

    public InterfaceState getActiveState() {
        return activeState;
    }
}
