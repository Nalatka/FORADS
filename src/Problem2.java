import java.util.Scanner;

public class Problem2 {
    /**
     * Calculates average of array
     * Time complexity: O(n) - Sum of all element in loop
     * @param n The number of elements
     * @param arr The list of elements
     * @return The average of elements
     */
    private static int averageOf(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum/n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = in.nextInt();
        System.out.print("Enter array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The average of " + n + " elements is " + averageOf(n, arr));
    }
}
