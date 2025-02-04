package AtmMachine_StateDesignPattern.models;

public class Card {
    private final int cardNumber;
    private final int pin;
    private final String name;
    private final String cardType;
    private final String bankName;


    public Card(int cardNumber, int pin, String name, String bankName, String cardType) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.name = name;
        this.bankName = bankName;
        this.cardType = cardType;
    }
    //Getters and Setters

    public int getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public String getCardType() {
        return cardType;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", pin=" + pin +
                ", name='" + name + '\'' +
                ", cardType='" + cardType + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
