package Pattern4;

import java.util.Scanner;

public class Lesson {
    static void main(){
        /*
        Паттерн 4: подсчитать с условием
        Задачи: 5, 19, 20, 24,  26 ,27,28
        Ключевые слова: сколько из них больше Х, количество четный, есть ли кратные

        Шаблон:

        Scanner scanner = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int countZero= 0;

        for(int i=0;i<10; i++){
            int number = scanner.nextInt();
            if(number>0){
                countPositive++;
            }else if(number<0){
                countNegative++;
            }else{
                countZero++;
            }
        }

        // Шаблон: есть ли хотя бы один
        boolean hasNegative = false;
        for(int i = 0; i<10; i++){
            int number = scanner.nextInt();
            if(number<0){
                hasNegative = true;
            }
        }
        if(hasNegative){
            System.out.println("Были отрицательные числа");
        }
    }
      */
    }
}
