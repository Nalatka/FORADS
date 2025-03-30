import java.util.Scanner;

public class Problem6 {
    /**
     * Computes power function using recursion, it reduces degree in two.
     * Time Complexity: O(n) - Linear recursive calls.
     * @param a Number put in power
     * @param n Degree of power
     * @return
     */
    public static long powerOf(long a, int n) {
        if (n == 0) return 1; //Power of 0 is 0
        long halfPower = powerOf(a, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power: ");
        int p = sc.nextInt();
        System.out.println(powerOf(n, p));
    }
}
