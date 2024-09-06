package year2023.week4.lectures.inheritance;

enum BicycleType {
    BMT, GT
}

class Bicycle extends Vehicle {
    private BicycleType bicycleType;

    public Bicycle(double speed, int numOfWheels, BicycleType bicycleType) {
        super(speed, numOfWheels);
        this.bicycleType = bicycleType;
    }

    @Override
    public void produceNoise() {
        System.out.println("I'M PRODUCING A BICYCLE NOISE");
    }

    public BicycleType getBicycleType() {
        return bicycleType;
    }

    public void setBicycleType(BicycleType bicycleType) {
        this.bicycleType = bicycleType;
    }
}