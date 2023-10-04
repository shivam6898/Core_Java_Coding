package javaeight;


import java.util.stream.Stream;


// peek method in a stream to perform an operation on each element of the stream without affecting the stream itself.
// The peek method is an intermediate operation that takes a Consumer function as its argument and applies that function
// to each element as they flow through the stream
public class PeekExample {
    public static void main(String[] args) {
        // Create a sample stream of integers
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream
            .peek(element -> System.out.println("Peeked: " + element))
            .map(element -> element * 2) // A subsequent operation
            .forEach(element -> System.out.println("Processed: " + element));

    }
}
