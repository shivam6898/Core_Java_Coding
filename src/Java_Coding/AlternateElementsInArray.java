package Java_Coding;

public class AlternateElementsInArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] outputArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i += 2) {
            if (i + 1 < inputArray.length) {
                outputArray[i] = inputArray[i + 1];
                outputArray[i + 1] = inputArray[i];
            } else {
                outputArray[i] = inputArray[i];
            }
        }

        // Print the output array
        for (int num : outputArray) {
            System.out.print(num + " ");
        }
    }
}
