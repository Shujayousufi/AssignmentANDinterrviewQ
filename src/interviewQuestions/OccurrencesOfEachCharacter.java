package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
public class OccurrencesOfEachCharacter {

	public static void main(String[] args) {
		
		String test = "this is a test this a better for this test";
	
		System.out.println(charsWithcount(test));
		wordCount(test);
	}
	public static String charsWithcount(String test) {
		HashMap<String , Integer> temp = new HashMap<String , Integer>();
		HashMap<String , Integer> duplicate = new HashMap<String , Integer>();
		for (String w : test.split(" ")) {
			if(temp.containsKey(w)) {
				temp.put(w, temp.get(w)+1 );
			}
			else {
				temp.put(w, 1);
			}
		}
		for (String word : temp.keySet()) {
			if(temp.get(word)>1) {
				duplicate.put(word, temp.get(word));
			}
		}
		return ""+ temp + "\n The following words are duplicates. \n\t" + duplicate;
	}
	public static void wordCount(String test) {
		HashMap<Character , Integer> chars = new HashMap<Character , Integer>();
		HashMap<Character , Integer> duplicate = new HashMap<Character , Integer>();
		for (int i = 0; i < test.length(); i++) {
			if(chars.containsKey(test.charAt(i))) {
				chars.put(test.charAt(i), chars.get(test.charAt(i))+1);
			}
			else {
				chars.put(test.charAt(i), 1);
			}
		}
		System.out.println(chars);
		for (Character c : chars.keySet()) {
			if(chars.get(c)>1) {
				duplicate.put(c, chars.get(c));
			}
		}
		System.out.println(duplicate);
	}
}
