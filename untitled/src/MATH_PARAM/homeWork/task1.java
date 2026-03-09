package MATH_PARAM.homeWork;

import java.text.DecimalFormat;
import java.util.Scanner;

public class task1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the salary 1: ");
        double firstSalary = sc.nextDouble();
        System.out.print("Write the salary 2: ");
        double secondSalary = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#,###.00€");

        if (firstSalary > secondSalary) {
            System.out.println("The first employee's salary is higher " + df.format(firstSalary));
        } else {
            System.out.println("The second employee's salary is higher " + df.format(secondSalary));
        }
    }
}
