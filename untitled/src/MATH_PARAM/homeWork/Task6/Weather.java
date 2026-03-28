package MATH_PARAM.homeWork.Task6;

public class Weather {
    public String generateWeather() {
        double weather = Math.random();
        if (weather < 0.65) {
            return "Sunny";
        } else if (weather < 0.90) {
            return "Rain";
        } else {
            return "Snow";
        }
    }
}
