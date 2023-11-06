package week6.lectures.generics;

import java.util.ArrayList;

// Class to hold an integer value and print out that integer when we want
class IntegerPrinter {
    private Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public Integer getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(this.thingToPrint);
    }
}

//What if we want to do a same thing with a String?
// We have to duplicate the code, just because of the type of the variable we are trying to use
// You see the pattern, we have to duplicate a code that essentially does the same thing
// For the more complex classes this becomes awful approach
// Generics allows you to accomplish the same thing with one flexible class for many types
class StringPrinter{
    protected String thingToPrint;

    public StringPrinter(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public String getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
}

class DoublePrinter{
    protected Double thingToPrint;

    public DoublePrinter(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public Double getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
}

class Start{
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter(6);
        integerPrinter.print();
    }
}


