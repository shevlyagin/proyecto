package Pattern6_7;

import java.util.Scanner;

public class Lesson {
    static void main() {
        /*
        ПАТТЕРН 6: "Определить категорию по значению"
        Примеры задач: 29, 30, 32, 33, 57

        Шаблон IF-ELSE для диапазонов:
        // Оценка в словах
        if (grade < 5) {
            System.out.println("Недостаточно");
        } else if (grade < 6) {
            System.out.println("Достаточно");
        } else if (grade < 7) {
            System.out.println("Хорошо");
        } else if (grade < 9) {
            System.out.println("Очень хорошо");
        } else {
            System.out.println("Отлично");
        }

        Шаблон SWITCH для конкретных значений:
        // День недели по номеру
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            // ... остальные дни
            default:
                System.out.println("Неверный номер");
        }



            ПАТТЕРН 7: "Расчёт по условиям"
            Примеры задач: 31, 36, 54

            double salary;
            if (hours <= 40) {
                salary = hours * 12;  // Обычная ставка
            } else {
                salary = 40 * 12 + (hours - 40) * 16;  // 40 обычных + переработка
            }:
         */
        task54Pattern6_7();
    }

    public static void task54Pattern6_7() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму, подлежащую налогообложению: ");
        double suma = sc.nextDouble();
        System.out.print("Введите ставку НДС (стандарт, пониженная, сверхпониженная): ");
        String iva = sc.next();
        System.out.print("Введите промокод (nopro, mitad, meno5, 5porc): ");
        String promokod = sc.next();

        System.out.println("Налогооблагаемая база: " + suma);

        double precio ;

        switch (promokod) {
            case "nopro":
                precio = 0;
                System.out.println("Промокод (акция не применяется): " + precio);
                break;
            case "mitad":
                precio = suma / 2;
                System.out.println("Промокод (цена сниже вдвое): " + precio);
                break;
            case "meno5":
                precio = 5;
                System.out.println("Промокод (применяется скидка в размере 5): " + precio);
                break;
            case "5porc":
                precio = suma * 0.05;
                System.out.println("Промокод (применяется скидка 5%): " + precio);
                break;

            default:
                precio = 0;
                System.out.println("Неверный промокод");
        }

        double priceWithPromo = suma - precio;
        double priceWithIva;

        switch (iva) {
            case "стандарт":
                priceWithIva = priceWithPromo * 0.21;
                System.out.println("НДС (21%) " + priceWithPromo);
                break;
            case "пониженная":
                priceWithIva = priceWithPromo * 0.10;
                System.out.println("НДС (10%) " + priceWithPromo);
                break;
            case "сверхпониженная":
                priceWithIva = priceWithPromo * 0.4;
                System.out.println("НДС (4%) " + priceWithPromo);
                break;

            default:
                priceWithIva = 0;
                System.out.println("Неверный выбор налога");
        }

        System.out.println("Цена с учетом НДС: " + (priceWithPromo + priceWithIva));
        System.out.println("Итого: " + (priceWithPromo + priceWithIva));
        }
}
