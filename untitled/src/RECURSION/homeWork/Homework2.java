package RECURSION.homeWork;

public class Homework2 {
    static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 2};

        int result = productArray(arr, arr.length);
        System.out.println(result);
    }

    public static int productArray(int[] arr, int n){
        if (n == 1) {
            return arr[0]; // базовый случай
        }
        return arr[n - 1] * productArray(arr, n - 1); // рекурсивный шаг
    }
}
