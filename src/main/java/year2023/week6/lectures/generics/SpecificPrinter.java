package year2023.week6.lectures.generics;

// Bounded generic, and we are able to call the methods on the T object related to the T
public class SpecificPrinter <T extends Animal> {
    private T thingToPrint; // Totally unaware what T will become

    // Generic type, anything we want
    public SpecificPrinter(T thingToPrint) {
        thingToPrint.eat();
        this.thingToPrint = thingToPrint;
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(this.thingToPrint);
    }
}


