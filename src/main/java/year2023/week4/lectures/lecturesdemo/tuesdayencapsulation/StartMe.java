package year2023.week4.lectures.lecturesdemo.tuesdayencapsulation;

import java.util.Date;

public class StartMe {
    public static void main(String[] args) {
        CreditCard becirsCard = new CreditCard(
                10,
                new Date(System.currentTimeMillis()),
                100,
                "123",
                CardType.CREDIT,
                CardIssuer.MASTERCARD
        );

        CreditCard anjasCard =  new CreditCard(1000);

        System.out.println(becirsCard.toString());
    }
}
