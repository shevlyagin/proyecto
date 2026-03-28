package INTERFACE.classWork.Task1;

public class Circle implements FigureInterface {

    private double radius;

    @Override
    public double area() {
        return radius * radius * PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
