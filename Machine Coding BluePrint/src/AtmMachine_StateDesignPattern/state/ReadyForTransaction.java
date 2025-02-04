package AtmMachine_StateDesignPattern.state;

import AtmMachine_StateDesignPattern.enums.AtmState;
import AtmMachine_StateDesignPattern.models.Card;

public class ReadyForTransaction implements State {
    @Override
    public int initTransaction() {
        return 0;
    }

    @Override
    public boolean readCardDetailsAndPIN(Card card) {
        return false;
    }

    @Override
    public int dispenseCash(int transactionId) {
        return 0;
    }

    @Override
    public void ejectCard() {

    }

    @Override
    public boolean readCashWithdrawDetails(int transactionID, int amount) {
        return false;
    }

    @Override
    public AtmState getState() {
        return AtmState.READY_FOR_TRANSACTION;
    }
}
