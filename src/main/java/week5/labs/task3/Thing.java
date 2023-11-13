package week5.labs.task3;

import java.util.HashMap;
import java.util.Map;

public class Thing extends Box{

    private int weigth;
    private String name;

    Map<String, Integer> boxMap = new HashMap<String, Integer>();

    public Thing(String name, int w){
        if(w < 0){
            throw new IllegalArgumentException("Weight cannot be negative");
        }else {
            this.weigth = w;
            this.name = name;
        }
    }

    public Thing(String name){
        this.name = name;
    }

    public Thing(int weigth){
        if(weigth < 0){
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.weigth = weigth;
    }

    public int getWeight(){
        return this.weigth;
    }

    @Override
    public void add(Thing thing) {
        boxMap.put(thing.name, thing.weigth);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object object){
        boolean isEqual= false;

        if (object != null && object instanceof Thing){
            isEqual = (this.name == ((Thing) object).name);
        }
        return isEqual;
    }
}