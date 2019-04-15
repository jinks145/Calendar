package Years;

public class Years {
	 public Year first, end;
	 
	 public Years(){
		 this.first = new Year(1); 
	 }
	 
	 public void newYear(int year) {
		 Year curr = null;
		 for(Year years = this.first; years.nextYear != null; years = years.nextYear )
			 curr = years;
		 
		 curr.nextYear = new Year(year);
	 }
	 
	 public void printYears() {
		 for(Year years = this.first; years.nextYear != null; years = years.nextYear )
			 System.out.println(years.getYear());
	 }
}
