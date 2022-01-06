package interviewQuestions;


public class Find_TestCase_Status_In_A_Two {

	public static void main(String[] args) {
	
		
		String [][] test = {{"tc001", "failed"},{"tc002", "failed"},{"tc003", "passed"}};
		
		for (int i = 0; i < test.length; i++) {
			if(test[i][1].equals("passed")) {
				System.out.println(test[i][0] + " "+test[i][1]);
			}
		
		}
	}
}
