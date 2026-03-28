package INTERFACE.classWork.Task1;

public class Rectangle implements FigureInterface {

    private double side;
    private double height;

    @Override
    public double area() {
        return side * height;
    }

    public Rectangle(double side, double height) {
        this.side = side;
        this.height = height;
    }
}
