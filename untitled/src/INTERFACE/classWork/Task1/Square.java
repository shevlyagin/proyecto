package INTERFACE.classWork.Task1;

public class Square implements FigureInterface {

    private double side;

    @Override
    public double area() {
        return side * side;
    }

    public Square(double side) {
        this.side = side;
    }
}
