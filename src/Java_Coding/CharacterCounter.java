package Java_Coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounter {
	public static void main(String[] args) {
		String str="programming123";
		//1
		System.out.println(getCharFreq(str));

		//2.
		System.out.println(str.chars()
				.mapToObj(ch -> (char) ch)
				.filter(Character::isLetterOrDigit) // Optional: Filter out non-letter/digit characters
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		);

//		System.out.println(Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

	}

	private static Map<Character, Integer> getCharFreq(String str) {
		Map< Character, Integer> hashMap= new HashMap<>();
			for (Character ch:str.toCharArray()) {
				if (hashMap.containsKey(ch)){
					hashMap.put(ch,hashMap.get(ch) +1);
				}else {
					hashMap.put(ch,1);
				}
			}
		return hashMap;
	}

}