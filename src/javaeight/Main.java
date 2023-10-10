package javaeight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 0, 3, 0, 5, 0, 2, 0};

        // Sort the numbers with zeros at the end
        sortWithZerosAtEnd(numbers);

        // Print the sorted array
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortWithZerosAtEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // Count of non-zero elements

        // Traverse the array and move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill the remaining elements with zeros
        while (count < n) {
            arr[count++] = 0;
        }
    }
}
