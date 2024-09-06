package year2023.week4.lectures.encapsulation;

import java.security.InvalidParameterException;
import java.util.Date;

public class AccountBalance {
    private int customerId;
    private int balance;
    private Date date;
    private boolean isActive;
    private CardType cardType;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < 0)
            throw new InvalidParameterException("Balance cannot be negative");
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
