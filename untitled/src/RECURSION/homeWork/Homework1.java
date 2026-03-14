package RECURSION.homeWork;

public class Homework1 {
     static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 2};

        int result = sumArray(arr, arr.length);
        System.out.println(result);
    }

    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0; // базовый случай
        }
        return arr[n-1] + sumArray(arr, n-1); // рекурсивный шаг
    }
}
