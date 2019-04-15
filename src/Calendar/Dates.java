package Calendar;


public class Dates {
		private String [] dates = {"Sun","Mon", "Tue", "Wed", "Thu","Fri", "Sat"};
		
		
		
		public String getDate(int num) {
			if(0<= num&& num < dates.length)
			return dates[num];
			else
				return "error";
		}
		
		
		
		
		
}

