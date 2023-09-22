package Java_Coding;

//121 is palindrome
public class Palindrome2 {
	public static void main(String[] args) {
		String input="123421";
		String rev=reverse(input);
		if (rev.equals(input))
			System.out.println(true);
		else
			System.out.println(false);
	}
	private static String reverse(String input) {
		if (input.equals(null)||input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length()-1)+reverse(input.substring(0, input.length()-1));
	}
}