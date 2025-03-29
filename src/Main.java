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
        //System.out.print("Enter an degree of power: ");
        //int power = in.nextInt();
        reverse(number,numbers);
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

     /**
      * Calculates factorial
      * Time complexity: O(n)
      * @param n Given number and range of factorial
      * @return Found factorial
      */
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

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

     /**
      * Computes power function using recursion.
      * Time Complexity: O(n) - Linear recursive calls.
      * @param n Number put in power
      * @param p Degree of power
      * @return Result of combinations
      */
    public static int powerOf(int n, int p) {
        if (n <=1) {
            return 1;
        }
        int i = p * powerOf(n, p -1); return i;
    }

     /**
      * Prints array in reversed order
      * Time Complexity: O(n) - Linear recursive calls.
      * @param n Range of array
      * @param arr The given array
      */
    public static void reverse(int n, int[] arr){
        if (n==0){ return;}
        System.out.println(arr[n-1]+" ");
        reverse(n-1,arr);
    }
}