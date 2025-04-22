package NiaveATM;

public class ATM {
    
    // Enum representing various states of the ATM machine
    private enum ATMState {
        IDLE,                   // ATM is idle and ready for a transaction
        TRANSACTION_IN_PROGRESS,// Transaction has started
        CARD_INSERTED,          // Card is inserted and validated
        AMOUNT_ENTERED,         // Withdrawal amount has been entered
        DISPENSING_CASH         // Cash is being dispensed
    }

    // Instance variables
    private String atmId;   // Unique identifier for the ATM machine
    private ATMState state; // Stores the current state of the ATM

    // Constructor to initialize ATM with a unique ID and set state to IDLE
    public ATM(String atmId) {
        this.atmId = atmId;
        this.state = ATMState.IDLE;
    }

    // Starts a new transaction if the ATM is not already in use
    public int startTransaction() {
        if (state == ATMState.TRANSACTION_IN_PROGRESS) {
            throw new IllegalStateException("Transaction already in progress.");
        }
        if (state == ATMState.DISPENSING_CASH) {
            throw new IllegalStateException("Cannot start a new transaction while dispensing cash.");
        }
        if (state == ATMState.CARD_INSERTED) {
            throw new IllegalStateException("Cannot start a new transaction. Card already inserted.");
        }
        state = ATMState.TRANSACTION_IN_PROGRESS;
        int transactionId = generateTransactionId(); // Generate unique transaction ID
        System.out.println("Transaction started with ID: " + transactionId + " on ATM: " + atmId);
        return transactionId;
    }

    // Cancels the current transaction and resets the state to IDLE
    public void cancelTransaction() {
        if (state == ATMState.IDLE) {
            throw new IllegalStateException("No transaction to cancel.");
        }
        if (state == ATMState.DISPENSING_CASH) {
            throw new IllegalStateException("Cannot cancel transaction while dispensing cash.");
        }
        state = ATMState.IDLE;
        System.out.println("Transaction canceled on ATM: " + atmId);
    }

    // Reads card details, validates them, and updates the ATM state
    public boolean readCard(String cardType, long cardNumber, int pin) {
        if (state != ATMState.TRANSACTION_IN_PROGRESS) {
            throw new IllegalStateException("Cannot read card. Start a transaction first.");
        }
        state = ATMState.CARD_INSERTED;
        boolean isValid = validateCardDetails(cardType, cardNumber, pin); // Simulate validation
        if (!isValid) {
            state = ATMState.IDLE; // Reset state if card is invalid
        }
        return isValid;
    }

    // Allows user to enter withdrawal amount and verifies limits
    public boolean enterAmount(double amount) {
        if (state != ATMState.CARD_INSERTED) {
            throw new IllegalStateException("Card must be inserted before entering an amount.");
        }
        state = ATMState.AMOUNT_ENTERED;
        return checkWithdrawalLimit(amount); // Check if amount is within allowed limits
    }

    // Dispenses cash and resets the ATM state
    public void dispenseCash(double amount) {
        if (state != ATMState.AMOUNT_ENTERED) {
            throw new IllegalStateException("Amount must be entered before dispensing cash.");
        }
        state = ATMState.DISPENSING_CASH;
        System.out.println("Dispensing cash: " + amount + " on ATM: " + atmId);
        state = ATMState.IDLE; // Reset state after dispensing cash
    }

    // Ejects the card from the ATM and resets the state
    public void ejectCard() {
        if (state == ATMState.IDLE) {
            throw new IllegalStateException("No card to eject.");
        }
        state = ATMState.IDLE;
        System.out.println("Card ejected from ATM: " + atmId);
    }

    // Private helper method to generate a unique transaction ID
    private int generateTransactionId() {
        return (int) (Math.random() * 100000);
    }

    // Private method simulating card validation logic
    private boolean validateCardDetails(String cardType, long cardNumber, int pin) {
        return true; // For simplicity, assume all cards are valid
    }

    // Checks withdrawal limit to ensure amount does not exceed predefined maximum
    private boolean checkWithdrawalLimit(double amount) {
        return amount <= 1000; // Assume a max withdrawal limit of 1000
    }
}


