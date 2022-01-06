package interviewQuestions;

public class Palindrome {

	public static void main(String[] args) {
		String word = "DAD";
		System.out.println("Method 1: Is "+ word+ " a palindrome? - "+ palindrome(word));
		System.out.println("Method 2: Is "+ word+ " a palindrome? - "+ palindrome2(word));
		System.out.println("Method 3: Is "+ word+ " a palindrome? - "+ palindrome3(word));

	}
	public static boolean palindrome(String str) {
		String rev = "";
		for (int i = str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		return str.equals(rev);
	}
	public static boolean palindrome2(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		return String.valueOf(sb).equals(str);
	}
	public static boolean palindrome3(String str) {
		for(int i= 0, j=str.length()-1; i< str.length(); i++, j--) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			if(i == j) {
				return true;
			}
		}
		return true;
	}

}
