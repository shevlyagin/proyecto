package PAKETY_STATIC.cinema;

public class Movie {

    private String title;
    private String genre;
    private String director;
    private int duration;
    private double price;

    public static int totalMovies;
    public static int totalAudience;

    public Movie(String title, String genre, String director, int duration, double price) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.duration = duration;
        this.price = price;

        totalMovies++;
    }

    public void addAudience(int people){
        totalAudience++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalMovies() {
        return totalMovies;
    }

    public static void setTotalMovies(int totalMovies) {
        Movie.totalMovies = totalMovies;
    }

    public static int getTotalAudience() {
        return totalAudience;
    }

    public static void setTotalAudience(int totalAudience) {
        Movie.totalAudience = totalAudience;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}


