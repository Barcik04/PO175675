package zad7;

import zad6.VideoGame;

import java.time.LocalDate;

public class CreditCard implements Cloneable {
    private String cardNumber;
    private String holderName;
    private LocalDate expiryDate;

    public CreditCard(String cardNumber, String holderName, LocalDate expiryDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "cardNumber: " + cardNumber + ", holderName: " + holderName + ", expiryDate: " + expiryDate;
    }

    public static void main(String[] args) {
        CreditCard c1 = new CreditCard("12345", "John Smith", LocalDate.of(1990, 1, 12));

        try {
            CreditCard c2 = (CreditCard) c1.clone();

            c1.setExpiryDate(LocalDate.of(1999, 2, 10));

            System.out.println(c1);
            System.out.println(c2);
        } catch (CloneNotSupportedException e) {
            System.out.println("not cloneable");
        }
    }
}
