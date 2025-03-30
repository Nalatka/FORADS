import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(gcd(n, m));
    }

    /**
     * Time complexity - O(log n) - Number of calls proportional to the number of digits
     * @param a First number
     * @param b Second number
     * @return Greatest common divisor
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
