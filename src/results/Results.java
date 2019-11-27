package results;

import java.util.Scanner;

public class Results {

	static int physicsValue;
	static int biologyValue;
	static int chemistryValue;
	static int total;
	static float percentage;
	
	public static void getResult() {
		Scanner myValue = new Scanner(System.in);
		System.out.println("Enter physics mark");
		physicsValue = myValue.nextInt();
		System.out.println("Enter biology mark");
		biologyValue = myValue.nextInt();
		System.out.println("Enter chemistry mark");
		chemistryValue = myValue.nextInt();
		
		System.out.println("Physics Mark: " + physicsValue);
		System.out.println("Chemistry Mark: " + chemistryValue);
		System.out.println("Biology  Mark: " + biologyValue);
		total += physicsValue + biologyValue + chemistryValue;
		System.out.println("Total Mark: " + total);
	}
	
	public static float getPercentage() {
		 percentage = total*100/450; 
		System.out.println("Percentage: " + percentage + "%");
		return total;
	}
	
	public static void isFailOverall() {
		if(percentage < 60) {
			System.out.println("Unfortunately you have failed");
		} 
		failExam();
	}
	
	
	public static void failExam() {
		String failed = "You have failed: ";
		if((physicsValue*100/150)<60) {
			failed += "Physics ";
			System.out.println(failed);
		}else if((chemistryValue*100/150)<60) {
			failed += "Chemistry ";
			System.out.println(failed);
		}else if((biologyValue*100/150)<60) {
			failed += "Biology ";
			System.out.println(failed);
		}
	}
	public static void main(String[] args) {
		getResult();
		getPercentage();
		isFailOverall();
	}
}
