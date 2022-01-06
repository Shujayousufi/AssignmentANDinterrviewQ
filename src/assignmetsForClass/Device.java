package assignmetsForClass;

import java.util.ArrayList;

public class Device {

	String customer;
	String model;
	int madeYear;
	String condition;
	ArrayList<String> listOfApps;
	String isbn;
	
	public Device() {
		customer = "";
		model = "";
		madeYear = 0;
		condition ="";
		listOfApps = new ArrayList<String>();
		isbn = "";
	}
	public Device (String  c, String m, int my, String condition, ArrayList<String>list, String newIsbn) {
		
		customer= c;
		model= m;
		madeYear= my;
		this.condition= condition;
		listOfApps=  list;
		isbn= newIsbn;	
		//this is for the test purpose.
	}
	public void printInfo() {
		String seperator = "--------------------------------------------------";
		System.out.println(seperator + "\nName of Customer:\t"+  customer + "\nDevice Model:\t\t" + model +
				"\nMake year:\t\t" + madeYear + "\nCondition:\t\t" + condition + "\nList of Apps:\t\t"+listOfApps+ "\nSerial Number:\t\t"+ isbn );
	}
}
