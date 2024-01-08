public class FibonacciIter {
// iтераційний метод
// просторова складність   O(n) - помилка
//                         O(1)
    // часова складність       O(n)
//
public static long fibonacci(int n) {
    long a0=0;
    long a1=1;
    long a2=1;
    for (int i=0; i<=n-2; i++) {
        a2=a1+a0;
        a0=a1;
        a1=a2;

    }
    return a2;
}
//    public static long fibonacci(int n) {
//        long[] array= new long[n+1];
//        array[0]=0;
//        array[1]=1;
//        for (int i=0; i<=n-2; i++) {
//            array[i+2]=array[i+1]+array[i];
//
//        }
//        return array[n];
//    }


    public static void main(String[] args) {
        int n = 32;
        long result = fibonacci(n);
        System.out.println("FibonacciIter(" + n + ") = " + result);
    }
}