package interviewQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class MethodSumWithAdditioanl_Logic {
	public static void main(String[] args) {
		//Given 3 integer values, a, b ,c, return their sum 
		//However, if one of the value is 10, then it does not count towards the sum.
		//for ex: (1, 2, 10) = 3:
		//			(2, 10, 2)= 4:
		System.out.println(freedomSum(1,2,1));
		String str = "Freedom Mortgage the Freedom wants to get more Mortgage";
		System.out.println(wordSplit(str));
		System.out.println(dulpicate(str));
	}
	public static int freedomSum(int a, int b, int c) {
		if(a == 10) {
			return b + c;
		}
		else if(b ==10) {
			return a + c;
		}
		else if(c == 10){
			return  a + b ;
		}
		else {
			return a + b + c;
		}
	}
	public static String wordSplit(String str) {
		String [] word = str.split("[^a-zA-Z]");
		String rej = str.replaceAll("[a-zA-Z]","");
		String res = "";
		for (int i = 0; i < word.length; i++) {
			res += wordProcess(word[i]);
			if(i <= rej.length()-1) {
				res += rej.charAt(i);
			}
		}
		return res;
	}
	public static String wordProcess(String str) {
		String r = str.substring(1, str.length()-1);
		HashSet<Character> chars = new HashSet<Character>();
		for (int i = 0; i < r.length(); i++) {
			chars.add(r.charAt(i));
		}
		return ""+ str.charAt(0)+ chars.size()+str.charAt(str.length()-1);
	}
	public static String dulpicate( String str) {
		
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		HashMap<String, Integer> duplicate = new HashMap<String, Integer>();
		for (String key : str.split(" ")) {
			if(temp.containsKey(key)) {
				temp.put(key, temp.get(key)+1);
			}
			else {
				temp.put(key, 1);
			}
		}
		for (String w : temp.keySet()) {
			if(temp.get(w)>1) {
				duplicate.put(w, temp.get(w));
			}
		}
		
		return ""+duplicate;
	}
}
