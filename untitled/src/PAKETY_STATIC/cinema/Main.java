package PAKETY_STATIC.cinema;

public class Main {

    static void main(String[] args) {

        Movie movie1 = new Movie("Дюна", "Фантастика", "Дени Вильнёв", 166, 450.0);
        Movie movie2 = new Movie("Опенгеймер", "Историческая драма", "Кристофер Нолан", 180, 520.0);
        Movie movie3 = new Movie("Всё везде и сразу", "Комедия/Боевик", "Дэн Кван, Даниэл Шайнерт", 139, 380.0);

        movie1.addAudience(1250);
        movie2.addAudience(3400);
        movie3.addAudience(680);

        System.out.println("Список фильмов: ");
        System.out.println(movie1 + "\t" + movie2 + "\t" + movie3);

        System.out.println("Статистика: ");
        System.out.println("Всего фильмов: " + Movie.getTotalMovies());
        System.out.println("Всего зрителей: " + Movie.getTotalAudience());
    }
}