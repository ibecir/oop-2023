package week13.labs.builder;

public class Main {
    public static void main(String[] args) {
        CoffeeDirector director = new CoffeeDirector();

        // Construct Espresso
        EspressoBuilder espressoBuilder = new EspressoBuilder();
        director.constructCoffee(espressoBuilder);
        Coffee espresso = espressoBuilder.getResult();
        System.out.println("Espresso: " + espresso);

        // Construct Latte
        LatteBuilder latteBuilder = new LatteBuilder();
        director.constructCoffee(latteBuilder);
        Coffee latte = latteBuilder.getResult();
        System.out.println("Latte: " + latte);

        // Construct Cappuccino
        CappuccinoBuilder cappuccinoBuilder = new CappuccinoBuilder();
        director.constructCoffee(cappuccinoBuilder);
        Coffee cappuccino = cappuccinoBuilder.getResult();
        System.out.println("Cappuccino: " + cappuccino);
    }
}
