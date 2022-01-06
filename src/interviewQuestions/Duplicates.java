package interviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Duplicates {

	public static void main(String[] args) {
		
		String str = "this is a test for a better test";
	duplicate(str);
	}
	public static void duplicate(String str) {
		Map<String, Integer> temp = new HashMap<String, Integer>();
		Map<String, Integer> duplicate = new HashMap<String, Integer>();
		for (String key : str.split(" ")) {
			if(temp.containsKey(key)) {
				temp.put(key, temp.get(key)+1);
			}
			else {
				temp.put(key, 1);
			}
		
		}
		System.out.println(temp);
		for (String w : temp.keySet()) {
			if(temp.get(w)>1) {
				duplicate.put(w, temp.get(w));
			}
		}
		System.out.println(duplicate);
	}
}
