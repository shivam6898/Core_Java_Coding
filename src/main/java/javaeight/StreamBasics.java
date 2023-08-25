package javaeight;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream API : this api is used to work on the sequence of data in functional programming way
// it allows us to perform map,filter,reduce on collection in a more expressive and efficient way
public class StreamBasics {

  //1.creating the stream
  //2.Intermediate Operation
    //3.Terminal Operation
    //4.short circuit operation


    //Creating Streams
    public static void main(String[] args) {
        //from a collection
        List<Number> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Number> numberStream = numberList.stream();

        //from Array
        String[] stringsArray = {"demo1", "demo2", "demo3"};
        Arrays.stream(stringsArray);
        //of
        Stream.of(stringsArray);
        //creating empty stream
        Stream.empty();
        //iterate is the infinite stream , 1st parameter takes the initial value
        //and second parameter as subsequent values
        Stream.iterate(2,  n-> n *2).limit(5);
        //2
        //4
        //8
        //16
        //32

        //creates infinite stream based on supplier generated values
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        Stream.generate(() -> new Random().nextInt(10)).limit(5).forEach(System.out::println);


        //from character sequence
        String text = "Hello, world!";
        IntStream charStream = text.chars();


        //from a file
        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            // Process lines
        } catch (IOException e) {
            e.printStackTrace();
        }

        //from StringBuilder
        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1).add(2).add(3);
        Stream<Integer> builtStream = builder.build();







    }
}
