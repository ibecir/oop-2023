package week7.lectures.lambdafunctions.classes;

import week7.lectures.lambdafunctions.interfaces.Printable;
import week7.lectures.lambdafunctions.interfaces.Readable;

public class Engine extends Component implements Readable, Printable {
    private int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void read() {
        System.out.println("VRNNN");
    }

    @Override
    public String printMe(String prefix) {
        return prefix.concat(" IN THE ENGINE");
    }
}
