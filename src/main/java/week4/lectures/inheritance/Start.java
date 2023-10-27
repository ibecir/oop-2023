package week4.lectures.inheritance;

public class Start {
    public static void main(String[] args) {
        Car car = new Car(100, 4, CarBrand.BMW);
        System.out.println(car.getSpeed());
        car.produceNoise();

        Bicycle bicycle = new Bicycle(30, 2, BicycleType.GT);
        System.out.println(bicycle.getBicycleType());

        changeObject(bicycle);

        System.out.println(bicycle.getBicycleType());

        bicycle.produceNoise();
    }

    public static void changeObject(Bicycle bicycle){
        bicycle.setBicycleType(BicycleType.BMT);
    }
}
