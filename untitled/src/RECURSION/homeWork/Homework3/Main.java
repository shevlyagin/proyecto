package RECURSION.homeWork.Homework3;

public class Main {
    static void main(String[] args) {

        MyDate examDate = new MyDate(15, 04, 2026);
        MyTime examTime = new MyTime(10, 30);

        Exam mathExam = new Exam("Math", "Room 101", examDate, examTime);

        System.out.println(mathExam);

        MyDate newDate = new MyDate(22, 5, 2026);
        MyTime newTime = new MyTime(14, 0);

        mathExam.setDate(newDate);
        mathExam.setTime(newTime);

        System.out.println("\nAfter the change:");
        System.out.println(mathExam);
    }
}
