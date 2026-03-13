package RECURSION.classWork;

public class Trip {
    private int code;
    private String title;
    private int km;

    public Trip(int code, String title, int km) {
        this.code = code;
        this.title = title;
        this.km = km;
    }


    public Trip(Trip trip){
        this.code = trip.code;
        this.title = trip.title;
        this.km = trip.km;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getKm() {
        return km;
    }
}
