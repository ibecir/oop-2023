package year2023.week4.lectures.lecturesdemo.tuesdayencapsulation;

import java.util.Date;

public class CreditCard {
    private int cardNo;
    private Date issueDate;
    private double balance;
    private String cvc;
    private CardType cardType;
    private CardIssuer cardIssuer;

    public CreditCard(int cardNo, Date issueDate, double balance, String cvc, CardType cardType, CardIssuer cardIssuer) {
        System.out.println("I'M FIRST CONSTRUCTOR WITH ALL PARAMS");
        this.cardNo = cardNo;
        this.issueDate = issueDate;
        this.balance = balance;
        this.cvc = cvc;
        this.cardType = cardType;
        this.cardIssuer = cardIssuer;
    }

    public CreditCard(int balance){
        System.out.println("I'M SECOND CONSTRUCTOR WITH ONLY BALANCE");
        this.cardNo = 123;
        this.issueDate = new Date();
        this.balance = balance;
        this.cvc = "123";
        this.cardType = CardType.CREDIT;
        this.cardIssuer = CardIssuer.MASTERCARD;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardIssuer getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(CardIssuer cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    public void deposit(int amount){

    }

    public void deposit(int amount, Date createdAt){

    }

    @Override
    public String toString(){
        return "This is a credit card with unique number: "
                .concat(String.valueOf(this.cardNo))
                .concat(" and its balance is: ")
                .concat(String.valueOf(this.balance));
    }
}
