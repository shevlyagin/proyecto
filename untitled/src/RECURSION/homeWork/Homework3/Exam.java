package RECURSION.homeWork.Homework3;

public class Exam {
    private String subject;
    private String classroom;
    private MyDate date;
    private MyTime time;

    public Exam(String subject, String classroom, MyDate date, MyTime time) {
        this.subject = subject;
        this.classroom = classroom;
        this.date = date;
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassroom() {
        return classroom;
    }

    public MyDate getDate() {
        return date;
    }

    public MyTime getTime() {
        return time;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    public void setTime(MyTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Exam: " + subject + "\n" +
                "Classroom: " + classroom + "\n" +
                "Date: " + date + "\n" +
                "Time: " + time;
    }
}
