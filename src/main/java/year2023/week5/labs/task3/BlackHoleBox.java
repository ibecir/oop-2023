package year2023.week5.labs.task3;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box{
    private List<Thing> box;

    public BlackHoleBox(){
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        box.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
