package javaeight;

import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

public class ofNullable {
    public static void main(String[] args) {

        System.out.println(ofNullable("test").stream().map(String::toUpperCase).findFirst().orElse("cc"));
    }
}
