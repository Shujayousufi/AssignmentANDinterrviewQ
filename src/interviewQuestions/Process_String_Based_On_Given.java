package interviewQuestions;

import java.util.HashSet;

public class Process_String_Based_On_Given {
	public static void main(String[] args) {
	 
		String str = "Freedom Mortgage"; 
	
		
	System.out.println(splitWord(str));
	}
	public static String splitWord(String str) {
		String [] words = str.split("[^a-zA-Z]");
		String reg = str.replaceAll("[a-zA-Z]", "");
		String res = "";
		for (int i = 0; i < words.length; i++) {
			res += prrocessOfWord(words[i]);
			if(i <= reg.length()-1) {
				res += reg.charAt(i);
//				if(i <= reg.length()-1) {
//					res += reg.charAt(i);
//				}
			}	
		}
		return res;
	}
	public static String prrocessOfWord(String str) {
		String r = str.substring(1,str.length()-1);
		HashSet<Character> chars = new HashSet<Character>();
		for (int i = 0; i < r.length(); i++) {
			chars.add(r.charAt(i));
		}
		return ""+ str.charAt(0)+ chars.size() + str.charAt(str.length()-1);
	}
}	

