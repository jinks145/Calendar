package Calendar;

import java.util.Scanner;

public class Run {
		
		
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("몇년까지?");
		int year = in.nextInt();
		Years years = new Years(year);
		for(int i = 2; i <= year; i++) {
			years.newYear(i);
		}
		
		years.printYears();
		
		
	}
}
