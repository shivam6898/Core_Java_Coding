package Java_Coding;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
	public static void main(String[] args) {
		String str="programming";
		System.out.println(getCharFreq(str));
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