package Java_Coding;

public class PerfectSquaresInRange {
    public static void main(String[] args) {
        int start = 1; // Starting number of the range
        int end = 100; // Ending number of the range
        
        int count = 0; // Initialize a counter for perfect squares
        
        // Iterate through the numbers in the range
        for (int i = start; i <= end; i++) {
            // Check if the square root of the number is an integer
            double sqrt = Math.sqrt(i);
            if (sqrt == (int) sqrt) {
                // If it is, then it's a perfect square
                System.out.println(i);
                count++;
            }
        }
        
        // Print the count of perfect squares
        System.out.println("Number of perfect squares in the range: " + count);
    }
}
