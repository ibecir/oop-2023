package year2023.week6.lectures.livecodingsession;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ComponentPrinter<T extends Component & Comparator> { // Check it OR

}

class ThingPrinter<SomethingOfTypeGeneric, V> {
    private SomethingOfTypeGeneric thingToPrint;
    private V anotherThingToPrint;

    public ThingPrinter(SomethingOfTypeGeneric thingToPrint, V anotherThingToPrint) {
        this.thingToPrint = thingToPrint;
        this.anotherThingToPrint = anotherThingToPrint;
    }

    public SomethingOfTypeGeneric getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(SomethingOfTypeGeneric thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public V getAnotherThingToPrint() {
        return anotherThingToPrint;
    }

    public void setAnotherThingToPrint(V anotherThingToPrint) {
        this.anotherThingToPrint = anotherThingToPrint;
    }

    public void printTheThing() {
        System.out.println(this.thingToPrint);
    }

    public void printAnotherTheThing() {
        System.out.println(this.anotherThingToPrint);
    }
}

class JustMainThing {
    public static void main(String[] args) {
        ThingPrinter<String, Component> stringThingPrinter = new ThingPrinter<>("Becir", new Component());
        stringThingPrinter.printTheThing();

        ThingPrinter<Integer, Motor> integerThingPrinter = new ThingPrinter<>(154, new Motor());
        integerThingPrinter.printTheThing();

        ThingPrinter<Double, Motor> componentThingPrinter = new ThingPrinter<>(2.0, new Motor());
        componentThingPrinter.printAnotherTheThing();

        List<String> strings = new ArrayList<>();
        strings.add("Some String");
        printWildCardList(strings);
    }

    public static <T, K, B> K returnMeAGeneric(T someGeneric, K anotherGeneric, B oneMore) {
        return anotherGeneric;
    }

    public static void printWildCardList(List<?> objectList) {
        System.out.println(objectList);
    }
}