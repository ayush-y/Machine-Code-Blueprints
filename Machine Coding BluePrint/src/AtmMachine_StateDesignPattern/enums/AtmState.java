package AtmMachine_StateDesignPattern.enums;

public enum AtmState {
    READY_FOR_TRANSACTION,
    READY_CARD_DETAILS_AND_PIN,
    DISPENSING_CASH,
    EJECTING_CARD,
    READING_CASH_WITHDRAW_DETAILS;

}
