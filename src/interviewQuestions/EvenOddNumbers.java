package interviewQuestions;

public class EvenOddNumbers {

	public static void main(String[] args) {
	
		isEvenOrOdd(1149857272);
		

	}
	public static void isEvenOrOdd(int num) {
		if( num % 2 == 0) {
			System.out.println(num+ " is even number.");
		}
		else {
			System.out.println(num+ " is an odd number.");
		}
	}
}
