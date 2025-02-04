package AtmMachine_StateDesignPattern.state;

import AtmMachine_StateDesignPattern.enums.AtmState;
import AtmMachine_StateDesignPattern.models.Card;

public interface State {
    int initTransaction();
    boolean readCardDetailsAndPIN(Card card); //returns true if card is valid and false otherwise
    int dispenseCash(int transactionId); //returns the amount dispensed
    void ejectCard();
    boolean readCashWithdrawDetails(int transactionID, int amount); //returns true if amount is valid and false otherwise
    AtmState getState();

}
