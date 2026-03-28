package INTERFACE.classWork.Task1;

public class Main {
    static void main(String[] args) {
        FigureInterface a = new Square(5);
        FigureInterface b = new Circle(5);
        FigureInterface c = new Rectangle(5, 2);

        System.out.println("Square: " + a.area());
        System.out.printf("Circle: " + "%.2f\n", b.area());
        System.out.println("Rectangle: " + c.area());
    }
}
