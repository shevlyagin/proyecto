package MATH_PARAM.homeWork.Task6;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        for (int i = 0; i < 10; i++) {
            System.out.println("Day " + (i + 1) + ": " + weather.generateWeather());
        }
    }
}
