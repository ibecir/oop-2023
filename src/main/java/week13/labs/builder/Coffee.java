package week13.labs.builder;

import java.util.ArrayList;
import java.util.List;

// Coffee Class
class Coffee {
    private String type;
    private String size;
    private List<String> toppings;

    public Coffee() {
        this.toppings = new ArrayList<>();
    }

    // Getters and setters

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}

// CoffeeBuilder Interface
interface CoffeeBuilder {
    void buildType();
    void buildSize();
    void buildToppings();
    Coffee getResult();
}

class EspressoBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public EspressoBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Espresso");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Small");
    }

    @Override
    public void buildToppings() {
        // No toppings for Espresso
    }

    @Override
    public Coffee getResult() {
        return coffee;
    }
}

class LatteBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public LatteBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Latte");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Medium");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Milk Foam");
    }

    @Override
    public Coffee getResult() {
        return coffee;
    }
}

class CappuccinoBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public CappuccinoBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Cappuccino");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Large");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Whipped Cream");
    }

    @Override
    public Coffee getResult() {
        return coffee;
    }
}

class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder) {
        builder.buildType();
        builder.buildSize();
        builder.buildToppings();
    }
}


