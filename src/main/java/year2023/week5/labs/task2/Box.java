package year2023.week5.labs.task2;

public class Box {
    private double maxWeight;
    private double currentWeight;
    private int numberOfThings;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.numberOfThings = 0;
    }

    public void add(ToBeStored object) {
        if((this.currentWeight + object.weight()) <= this.maxWeight) {
            this.currentWeight += object.weight();
            this.numberOfThings++;
        }
    }

    public String toString(){
        return "Box: " + numberOfThings + " things, total weight " + this.currentWeight + " kg";
    }
}
