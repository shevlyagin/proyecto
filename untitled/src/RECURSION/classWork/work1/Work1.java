package RECURSION.classWork.work1;

public class Work1 {

    static void main(String[] args) {
        power(5);
    }

    public static double power(double x, double y) {
        if (y == 1) {
            return x;              // базовый случай
        }
        return x * power(x, y - 1); // рекурсивный шаг
    }

    public static int hardWork(int i) {
        if (i == 1) {
            return 1;
        }
        return i + hardWork(i-1);
    }
}

/*

1)
i = 3,
3 + hardWork(2)

2)
i = 2,
2 + hardWork(1)

3)
i = 1
1

Результат: 3+2+1
 */