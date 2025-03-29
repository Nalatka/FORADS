import java.util.Scanner;

public class Problem3 {
    /**
     * Checks if the number is prime or not
     * Time complexity: O(n)- checking divisibility up to n
     * @param number Given number
     * @return True or False
     */
    public static boolean IsPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("Is "+number+" prime number? "+(IsPrime(number) ? "Yes" : "No"));
    }
}
