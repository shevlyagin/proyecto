```java
// power(2, 3) = 2 * 2 * 2 = 8
// Рекурсивная формула: power(x, y) = x * power(x, y-1)
// Базовый случай: power(x, 1) = x

public static double power(double x, double y) {
    if (y == 1) {
        return x;              // базовый случай
    }
    return x * power(x, y - 1); // рекурсивный шаг
}
```



```java
// factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
// Формула: factorial(n) = n * factorial(n-1)
// Базовый случай: factorial(1) = 1

public static int factorial(int n) {
    if (n == 1) return 1;
    return n * factorial(n - 1);
}
```


```java
public static ТИП имяМетода(ПАРАМЕТРЫ) {
    if (БАЗОВЫЙ_СЛУЧАЙ) {
        return ПРОСТОЙ_РЕЗУЛЬТАТ;
    }
    return КОМБИНАЦИЯ + имяМетода(УПРОЩЁННЫЕ_ПАРАМЕТРЫ);
}
```