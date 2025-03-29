import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        //System.out.print("Enter " + number + " numbers: ");
        //int[] numbers = new int[number];
        //for (int i = 0; i < numbers.length; i++) {
            //numbers[i] = in.nextInt();
        //}
        System.out.print("Is "+number+" prime? "+(IsPrime(number) ? "Yes" : "No"));
    }
     /**
      *Finds minimum in array
     *Time complexity - O(n) - Goes through every element in array
      */
      public static int findMin(int n, int[] arr) {
         int min = arr[0];
         for (int i = 1; i < n; i++) {
             if (arr[i] < min) {
                 min = arr[i];
             }
         }
         return min;
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


     /**
      * Checks if the number is prime or not
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

}