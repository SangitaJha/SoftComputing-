public class Fibonacci {
    public static void printFibonacciSequence(int count) {
        int a = 0, b = 1, c = 1;
        for (int i = 1; i <= count; i++) {
            System.out.println(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        printFibonacciSequence(10);
    }
}
