package week6.lectures.generics;

import javax.swing.text.html.Option;
import java.util.Optional;

class Animal {
    private int numOfLegs;

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public void eat(){
        System.out.println("Animal Eating");
    }
}
