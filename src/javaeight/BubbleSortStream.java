package javaeight;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSortStream {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        IntStream.range(0, arr.length - 1)
            .flatMap(i ->
                IntStream.range(0, arr.length - 1 - i)
                    .filter(j -> arr[j] > arr[j + 1])
                    .peek(j -> {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }))
            .forEachOrdered(j -> System.out.println(Arrays.toString(arr)));
    }
}
