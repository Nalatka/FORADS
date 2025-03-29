import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        System.out.print("Enter " + number + " numbers: ");
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        int result = averageOf(number,numbers);
        System.out.println("The average of " + number + " numbers is " + result);
        System.out.print("Time taken in milliseconds: "+duration);
    }

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
}