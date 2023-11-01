package week6.lectures.generics;

import java.io.Serializable;

// Bounded generic on the interfaces and classes
// As many of these as you want although only one class and class should come first
public class SpecificAndInterfacePrinter<T extends Animal & Serializable> {
    private T thingToPrint; // Totally unaware what T will become

    // Generic type, anything we want
    public SpecificAndInterfacePrinter(T thingToPrint) {
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
