import java.util.Scanner;

public class Problem5 {
    /**
     *Time Complexity: O(2^n) - Exponential growth
     * @param n Given number and range of function
     * @return n-th Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number is : "+fibonacci(n));
    }
}
