import java.util.Scanner;

class factorial {

    public static factoriall(int n) {
        if (n == 1)
            return 1;
        else
            return n * factoriall(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factoriall(n));
    }
}
