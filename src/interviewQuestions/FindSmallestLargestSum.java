package interviewQuestions;

public class FindSmallestLargestSum {

	public static void main(String[] args) {
		int[] nums = {-1,121,231,450,-5, 56,657,67,85};
		System.out.println("largest value is "+findLargestValue(nums));
		System.out.println("Smallest value is "+findSmallestValue(nums));
		System.out.println("Sum value is "+findSumValue(nums));
		
		System.out.println("Average value is "+findavgValue(nums));
		System.out.println("Second Largest value is "+findSecondLargestValue(nums));
		System.out.println("Second Smallest value is "+findSecondSmallestValue(nums));
	}
	public static int findSecondLargestValue(int [] nums) {
		int secondLargest = Integer.MIN_VALUE;
		int largest = findLargestValue(nums);
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] >secondLargest && nums[i]< largest) {
				secondLargest = nums[i];
			}
		}
		
		return secondLargest;
	}
	public static int findSecondSmallestValue(int [] nums) {
		int secondSmallest =Integer.MAX_VALUE;
		int smallest = findSmallestValue(nums);
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < secondSmallest && nums[i]> smallest ) {
				secondSmallest = nums[i];
			}
		}
		return secondSmallest;
	}
	public static int findLargestValue(int [] nums) {
		//int largest = nums[0]; //can be used also
		int largest = Integer.MIN_VALUE;
		for(int i=0; i < nums.length; i++) {
			if(largest < nums[i]) {
				largest = nums[i];
			}
		}
		return largest;
	}
	public static int findSmallestValue(int [] nums) {
		//int smallest = nums[0];
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i < nums.length; i++) {
			if(smallest > nums[i]) {
				smallest = nums[i];
			}
		}
		return smallest;
	}
	public static int findSumValue(int [] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];	
		}
		return sum;
	}
	public static double findavgValue(int [] nums) {
		return (double) findSumValue(nums)/nums.length;
	}
}
