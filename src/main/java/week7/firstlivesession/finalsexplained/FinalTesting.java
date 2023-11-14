package week7.firstlivesession.finalsexplained;

// Final classes cannot be extended
class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Final methods cannot be overridden
    public final String sayHello() {
        return "Hello";
    }
}

class Motorbike extends Vehicle {
    public Motorbike(String name) {
        super(name);
    }

    public static void main(String[] args) {
        System.out.println(RunMyFinals.PI_VALUE);
    }
}

class Car extends Vehicle {
    private final int hp;
    public Car(String name, int hp) {
        super(name);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
}

class RunMyFinals {

    public static final double PI_VALUE = 3.14;

    public static void main(String[] args) {
        Car c = new Car("Benga", 10);
        System.out.println(c.getName());

        final Car MY_CAR;
        MY_CAR = new Car("Mecka", 100);
        System.out.println(MY_CAR.getName());
    }
}

