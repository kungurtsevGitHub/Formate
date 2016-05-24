package main.java.it.sevenbits.formatter.stateMachine;

/**
 * Created by igor on 12.05.16.
 */

public interface InterfaceStateMachine {
     void transition(char symbol);
     InterfaceState getActiveState();
     //char getCurrentSymbol();
     //char getPreviousSymbol();
     //void changeStr(String str);
     //InterfaceTableTransits getTableTransitions();

}
