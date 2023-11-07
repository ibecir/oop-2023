package week5.labs.task3;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private int currentWeight;
    private List<Thing> box;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight() <= this.maxWeight - this.currentWeight){
            box.add(thing);
            this.currentWeight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        boolean found = false;

        for(Thing t : box){
            if(t.equals(thing)){
                found = true;
                break;
            }
        }
        return found;
    }

}
