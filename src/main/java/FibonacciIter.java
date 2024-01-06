public class FibonacciIter {
// iтераційний метод
// просторова складність   O(n)
// часова складність       O(n)
    public static long fibonacci(int n) {
        long[] array= new long[n+1];
        array[0]=0;
        array[1]=1;
        for (int i=0; i<=n-2; i++) {
            array[i+2]=array[i+1]+array[i];

        }
        return array[n];
    }
    public static void main(String[] args) {
        int n = 32;
        long result = fibonacci(n);
        System.out.println("FibonacciIter(" + n + ") = " + result);
    }
}