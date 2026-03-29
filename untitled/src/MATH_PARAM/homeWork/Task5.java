package MATH_PARAM.homeWork;

import java.text.DecimalFormat;

public class Task5 {

    double counterRed = 0;
    double counterBlack = 0;

    public String Draw() {
        if (Math.random() < 0.50) {
            counterRed++;
            return "Red";
        } else {
            counterBlack++;
            return "Black";
        }
    }

    public static void main(String[] args) {
        Task5 obj = new Task5();
        for (int i = 0; i < 15; i++) {
            System.out.println("Draw " + (i + 1) + ": " + obj.Draw());
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Red: " + df.format(obj.counterRed / 15 * 100) + "%, Black: " +
                df.format(obj.counterBlack / 15 * 100) + "%");
    }
}