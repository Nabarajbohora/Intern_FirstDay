package recursion;

public class RecursionDemo {
    // Recursive static method
    public static int calculateFactorial(int n) {
        // 1. BASE CASE: Stop when n drops to 1
        if (n == 1) {
            return 1;
        }
        return n * calculateFactorial(n-1);
    }
    public static void main(String[] args) {
        int result = calculateFactorial(4);
        System.out.println("Factorial of 4 is: " + result); // Prints 24
    }
}