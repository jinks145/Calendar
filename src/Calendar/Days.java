package Calendar;
import java.util.*;

public class Days {
	int year[][] = new int[12][30];
	LinkedList<Integer> years = new LinkedList<Integer>();
	
	public Days(int[][] arr, LinkedList<Integer> years) {
		
		this.year = arr;
		this.years = years;
	}

	public int[][] getArr() {
		return year;
	}

	public void setArr(int[][] arr) {
		this.year = arr;
	}

	public LinkedList<Integer> getYears() {
		return years;
	}

	public void setYears() {
		
				
		
		this.years = years;
	}
	
	
	
	
	
}
