package year2023.week4.lectures.lecturesdemo.tuesdayinheritance;

enum Color {
    BLACK, GRAY, WHITE
}

enum FuelType {
    DIESEL, PETROL
}

class Vehicle {
    private int numOfGears;
    private int numOfWheels;
    private Color color;

    public Vehicle(){}

    public Vehicle(int numOfGears, int numOfWheels, Color color) {
        System.out.println("I'M  A VEHICLE");
        this.numOfGears = numOfGears;
        this.numOfWheels = numOfWheels;
        this.color = color;
    }

    public int getNumOfGears() {
        return numOfGears;
    }

    public void setNumOfGears(int numOfGears) {
        if (numOfGears <= 0){
            System.out.println("THIS IS NOT GOOD FOR YOU!");
            return;
        }

        this.numOfGears = numOfGears;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void makeSound(){
        System.out.println("VRNNNNN VRNNNNNN");
    }
}

class Car extends Vehicle {

    public Car(FuelType fuelType, int numOfGears, int numOfWheels, Color color){
        super(numOfGears, numOfWheels, color);
        System.out.println("I'M A CAR");
        this.fuelType = fuelType;
    }
    private FuelType fuelType;

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void makeSound(){
        System.out.println("BRNNNN");
    }
}

class Bicycle extends Vehicle {
    private boolean doesItHaveDinama;

    public Bicycle(boolean doesItHaveDinama, int numOfGears, int numOfWheels, Color color) {
        super(numOfGears, numOfWheels, color);
        System.out.println("I'M A BICYCLE");
        this.doesItHaveDinama = doesItHaveDinama;
    }

    public boolean isDoesItHaveDinama() {
        return doesItHaveDinama;
    }

    public void setDoesItHaveDinama(boolean doesItHaveDinama) {
        this.doesItHaveDinama = doesItHaveDinama;
    }

    @Override
    public void makeSound(){
        System.out.println("FIIIIIIIII FIIIIIII");
    }
}

class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(false, 21, 2, Color.BLACK);
        Car c = new Car(FuelType.DIESEL, 5, 4, Color.WHITE);
        Vehicle v = new Vehicle();

        bike.makeSound();
        c.makeSound();
        v.makeSound();
    }
}
