import java.util.Scanner;

public class Problem7 {
    /**
     * Prints array in reversed order
     * Time Complexity: O(n) - Linear recursive calls.
     * @param n
     * @param sc
     */
    public static void reverse(int n, Scanner sc) {
        if (n == 0) {
            return;
        }
        int temp = sc.nextInt();
        reverse(n-1,sc);
        System.out.print(temp+" ");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n,sc);
    }
}