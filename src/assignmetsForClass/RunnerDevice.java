package assignmetsForClass;

import java.util.ArrayList;

public class RunnerDevice {
	public static void main(String[] args) {
		
	
	
	ArrayList<String>apps = new ArrayList<String>();
	apps.add("Facebook");
	apps.add("YouTube");
	apps.add("Google");
	apps.add("TikTak");
	Device obj1 = new Device ("John", "Iphone", 2021, "Excellent", apps, "D344G34234H2" );
	Device obj2 = new Device ("Michael", "Iphone", 2021, "Excellent", apps, "D344G34234H2" );
	Device obj3 = new Device ("Max", "Iphone", 2020, "Excellent", apps, "D344G34234H2" );
	ArrayList<String>apps2 = new ArrayList<String>();
	apps2.add("Apple Store");
	apps2.add("Chrome");
	
	Device obj4 = new Device ("John", "Iphone", 2021, "Excellent", apps2, "D344G34234H2" );
	Device obj5 = new Device ("Michael", "Iphone", 2021, "Excellent", apps2, "D344G34234H2" );
	Device obj6 = new Device ("Max", "Iphone", 2020, "Excellent", apps2, "D344G34234H2" );
	obj1.printInfo();
	obj2.printInfo();
	obj3.printInfo();
	obj4.printInfo();
	obj5.printInfo();
	obj6.printInfo();
	
			
	
	}

}
