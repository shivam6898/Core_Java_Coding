package Java_Coding;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounter {
	public static void main(String[] args) {
		String str="programming123";
		System.out.println(getCharFreq(str));
		System.out.println(str.chars()
				.mapToObj(ch -> (char) ch)
				.filter(Character::isLetterOrDigit) // Optional: Filter out non-letter/digit characters
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		);

	}

	private static Map<Character, Integer> getCharFreq(String str) {
		Map< Character, Integer> charFreq= new HashMap<>();
		if (str != null) {
			for (Character ch:str.toCharArray()) {
				Integer count=charFreq.get(ch);
				int newCount=(count==null? 1:count+1);
				charFreq.put(ch, newCount);
			}
		}
		return charFreq;
	}

}