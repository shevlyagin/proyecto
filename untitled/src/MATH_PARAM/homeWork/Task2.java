package MATH_PARAM.homeWork;

public class Task2 {

    public static void main(String[] args){
        int number1 = 10;
        int number2 = 5;

        System.out.println("Before:         " + number1 + ", " + number2);

        int resAdd = add(number1, number2);
        int resSub = subtract(number1, number2);
        int resMul = multiply(number1, number2);
        int resDiv = divide(number1, number2);

        System.out.println("=============== Results ===============");
        System.out.println("Addition:       " + resAdd);
        System.out.println("Subtraction:    " + resSub);
        System.out.println("Multiplication: " + resMul);
        System.out.println("Division:       " + resDiv);

        System.out.println("After:          " + number1 + ", " + number2);
        System.out.println("=======================================");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero!");
            return 0;
        }
        return a / b;
    }
}
