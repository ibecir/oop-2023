package year2023.week4.labs.shape;


public class Circle extends Shape {
    protected double radius;
    public Circle( FillType fillType, String color, double radius) {
        super(color, fillType);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }
    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }
    public double calculateCircumference(double r) {
        double PI = Math.PI;
        return calculateCircumference(PI, r);
    }
}
