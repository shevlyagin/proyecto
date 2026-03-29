package MATH_PARAM.homeWork;

public class Task4 {

    public static void deleteEmployee(String[] employees, int position) {
        for (int i = position; i < employees.length - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[employees.length - 1] = null;
    }

    static void main(String[] args) {
        String[] employees = {"Alexey", "Maria", "Ivan", "Olga", "Dmitry"};

        deleteEmployee(employees, 2);

        for (String n : employees) {
            System.out.println(n);
        }
    }
}
