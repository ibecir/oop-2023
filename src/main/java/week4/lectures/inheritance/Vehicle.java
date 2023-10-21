package week4.lectures.inheritance;

public class Vehicle {
    private double speed;
    private int numOfWheels;

    public Vehicle(double speed, int numOfWheels){
        this.speed = speed;
        this.numOfWheels = numOfWheels;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void produceNoise(){
        System.out.println("GENERIC VEHICLE NOISE");
    }
}
