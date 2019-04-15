package Years;

public class Years {
	 public Year first;
	 
	 public Years(int year){
		 this.first = new Year(1);
	 }
	 
	 public void newYear(int year) {
		 Year curr = first;
		 for(Year years = this.first; years.nextYear != null; years = years.nextYear )
			 curr = years;
		 
		 curr.nextYear = new Year(year);
	 }
	 
	 public void printYears() {
		 for(Year years = this.first; years.nextYear != null; years = years.nextYear )
			 System.out.println(years.getYear());
	 }
}
