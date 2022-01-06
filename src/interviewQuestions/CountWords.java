package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountWords{
	
	public static void main(String[] args) {
//		System.out.println(countWords("this is a test"+" this is a test"));
//		System.out.println(countChars("this is a test"));
		String test = "this is a test this is  test";
		countWords(test);
		countChars(test);
	}
	public static void countWords(String test) {
			Map<String, Integer> words = new HashMap<String, Integer>();
			Map<String, Integer> duplicate = new HashMap<String, Integer>();
			for (String w : test.split(" ")) {
				if(words.containsKey(w)) {
					words.put(w, words.get(w)+1);
				}
				else {
					words.put(w, 1);
				}
			}
		System.out.println(words);	
		for (String key : words.keySet()) {
			if(words.get(key)>1) {
				duplicate.put(key, words.get(key));
			}
		}
		System.out.println(duplicate);
	}
	//public static Map<Character, Integer>(String str)
	public static void countChars(String str) {
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		for(int i =0; i <str.length(); i++) {
			if(chars.containsKey(str.charAt(i))) {
				chars.put(str.charAt(i), chars.get(str.charAt(i))+1);
			}
			else {
				chars.put(str.charAt(i), 1);
			}
		}
		//return chars;
		System.out.println(chars);
	}
}