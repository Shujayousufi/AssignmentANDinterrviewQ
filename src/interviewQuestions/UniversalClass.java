package interviewQuestions;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniversalClass {

	public static void main(String[] args) {

	
	String [] data = {"test", "this", "nice", "this", "price", "test"};
	String str = "this is a test for the test takers to pass this exam for anohter job";
	String w = "Freedom Mortgage";
	int [] num = {5,3,6,55,444,333,22,-3,-1,2,5555};
	
	System.out.println(findArrayDuplicate(data));
	System.out.println(duplicate(str));
	System.out.println(splitWord(w));
	System.out.println(maxValue(num));
	System.out.println(secondMaxValue(num));
	System.out.println(minValue(num));
	System.out.println(sumValue(num));
	System.out.println(averageValue(num));
	
	}
	public static String findArrayDuplicate(String [] data) {
		Map<String , Integer> temp = new HashMap<String , Integer>();
		Map<String , Integer> duplicate = new HashMap<String , Integer>();
		for (int i = 0; i < data.length; i++) {
			if(temp.containsKey(data[i])) {
				temp.put(data[i], temp.get(data[i])+1);
			}
			else {
				temp.put(data[i], 1);
			}
		}
		for (String string : temp.keySet()) {
			if(temp.get(string)>1) {
				duplicate.put(string, temp.get(string));
			}
		}
		return ""+duplicate;
	}
	public static String duplicate(String str) {
		Map<String , Integer> temp = new HashMap<String , Integer>();
		Map<String , Integer> duplicate = new HashMap<String , Integer>();
		for (String word : str.split(" ")) {
			if(temp.containsKey(word)) {
				temp.put(word, temp.get(word)+1);
			}else {
				temp.put(word, 1);
			}
		}
		for (String w : temp.keySet()) {
			if(temp.get(w)>1) {
				duplicate.put(w, temp.get(w));
			}
		}
		return ""+temp+ "\n" +duplicate;
	}
	public static String splitWord(String w) {
		String []words = w.split("[^a-zA-Z]");
		String rej = w.replaceAll("[a-zA-Z]", "");
		String res = "";
		for (int i = 0; i < words.length; i++) {
			res += wordProcess(words[i]);
			if(i <= rej.length()-1) {
				res += rej.charAt(i);
			}
		}
		return res;
	}
	public static String wordProcess(String w) {
		String r = w.substring(1, w.length()-1);
		HashSet<Character>chars = new HashSet<Character>();
		for (int i = 0; i < r.length(); i++) {
			chars.add(r.charAt(i));
		}
		return ""+w.charAt(0)+ chars.size()+ w.charAt(w.length()-1);
	}
	public static int maxValue(int []num) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if( max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}
	public static int secondMaxValue(int []num) {
		int secondMax = Integer.MIN_VALUE;
		int max = maxValue(num);
		for (int i = 0; i < num.length; i++) {
			if(num[i] > secondMax && num[i] < max) {
				secondMax = num[i];
			}
		}
		return secondMax;
	}
	public static int minValue(int []num) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if( min > num[i]) {
				min = num[i];
			}
		}
		return min;
	}
	public static int sumValue(int []num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	public static double averageValue(int [] num) {
		double avg = (double) sumValue(num)/0;
		avg = Math.round(avg*100.0)/100.0;
		return avg;
	}
}
