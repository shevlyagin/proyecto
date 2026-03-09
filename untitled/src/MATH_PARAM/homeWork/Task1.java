package MATH_PARAM.homeWork;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the salary 1: ");
        double salary1 = sc.nextDouble();

        System.out.print("Write the salary 2: ");
        double salary2 = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("#,##0.00 €",
                new DecimalFormatSymbols(Locale.GERMANY));

        if (salary1 > salary2) {
            System.out.println("The first employee's salary is higher " + df.format(salary1));
        } else if (salary1 < salary2) {
            System.out.println("The second employee's salary is higher " + df.format(salary2));
        } else {
            System.out.println("Salaries are equal");
        }

        sc.close();
    }
}
