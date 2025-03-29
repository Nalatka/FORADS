public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        int result=findMin();
        System.out.println("Min of {10 1 32 3 45} is "+result);
        System.out.println("Time taken "+duration+" milliseconds");
    }
    public static int findMin(){
        return findMin(5, new int[]{10, 1, 32, 3, 45});
    }

    private static int findMin(int n, int[] arr) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}