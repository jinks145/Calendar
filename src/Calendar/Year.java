package Calendar;

public class Year {
		private int month[][] = new int[12][31];
		private int year = 0;
		
		public Year nextYear = null;
		
		
		public Year(int year) {
			this.setYear(year);
			for(int i = 1; i <= month.length; i++) 
				setMonth(i);
		}
		private void setYear(int year) {
			this.year = year;
		}
		
		private void setMonth(int M) {
			int last = 31;
			int m = 0;
			
			if(0 < M && M < 13) 
				m = M - 1;
			
			else
			System.out.println("error");
			
			
			if(M == 2) {
				if((year % 4 == 0) && (year % 400 == 0)) {
					last = 28;
				}
				else {
					last = 29;
				}
				
			}
			
			else if(M % 2 == 0){
				last = 30;
			}
			
			for(int i = 0; i < last; i++) 
				month[m][i]  = i + 1;
			
			
		 		
		}
		public int getYear() {
			return year;
		}
		
		
		
}
