import java.util.HashMap;
import java.util.Map;

public class FibonacciDP {
// динамічне програмування чисел Фібоначчі
//просторова складність    O(n)
//часова складність        O(n)
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, fib);
        return fib;
    }

    public static void main(String[] args) {
        int n = 32;
        long result = fibonacci(n);
        System.out.println("FibonacciDP(" + n + ") = " + result);
    }
}