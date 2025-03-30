import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(binomial(n, m));
    }

    /**
     * Time Complexity O(2^n) - Call function two times
     * @param n total number of items
     * @param k number of items to choose
     * @return Binomial coefficient
     */
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomial(n - 1, k) + binomial(n - 1, k - 1);
    }
}
