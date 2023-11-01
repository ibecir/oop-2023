package week6.lectures.generics;

import java.io.Serializable;

// Bounded generic on the interfaces
public class SpecificInterfacePrinter<T extends Serializable> {
    private T thingToPrint; // Totally unaware what T will become

    // Generic type, anything we want
    public SpecificInterfacePrinter(T thingToPrint) {
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
