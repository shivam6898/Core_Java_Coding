package Java_Coding;

class VowelsInString {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        inputString = inputString.toLowerCase();

        // Use Java 8 streams to filter and print vowels
        inputString.chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)        // Check if the character is a vowel
                .distinct()                                     // Optional: Remove duplicates
                .forEach(ch -> System.out.println((char) ch));  // Print each vowel
    }
}