package MATH_PARAM.classWork;

import java.text.DecimalFormat;

public class Lesson {


    /*
    // Случайное от min до max (включительно):
    int random = (int)(Math.random() * (max - min + 1)) + min;
     */
    static void main(String[] args) {
//        System.out.println(new Cat("Barsik", 11));
//        System.out.println(Math.abs(-10));
//
//
//        int random = (int)(Math.random() * 11) + 50;
//
//
//        double salaru = 1_452.389;
//        DecimalFormat df = new DecimalFormat("#,###.00P");
//        System.out.println(df.format(salaru));


        int a = 10;
        int b = 2;
        doubleIt(a, b);

        System.out.println("После метода: а = " + a + ", b = " + b);


        String[] names = {"Ann", "Vasay", "Peter"};
        changeName(names);

        for (String n : names){
            System.out.println(n);
        }
    }


    public static void doubleIt(int a, int b){
        a = a* a;
        b = b*b;
        System.out.println("Внутри метода: а = " + a + ", b = " + b);
    }



    public static void changeName(String[] names){
        names[0] = "Any name";
    }
}
