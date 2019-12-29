package main.engine.exception;

public class BattleDoesNotHaveStackAwaitingActionException extends Exception {
    public BattleDoesNotHaveStackAwaitingActionException() {
        super("Battle Does Not Have Stack waiting for Action");
    }
}
