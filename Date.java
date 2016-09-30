

public class Date {

	private int year;
	private int month;
	private int day;

	public Date() {	
		this.year = 1000;
		this.month = 1;
		this.day = 1;
	}

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(!(year >= 1000 && year <= 9999)){
			throw new IllegalArgumentException("Invalid Year!");
		} 
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(!(month >= 1 && month <= 12)){
			throw new IllegalArgumentException("Invalid Month!");

		} 
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(!(day >= 1 && day <= 31)){
			throw new IllegalArgumentException("Invalid Day!");
		} 

		this.day = day;
	}

	public void setDate(int year, int month, int day) {
      if( month == 4 || month == 6 || month == 9 || month == 11 ) { // these months have 30 days
        if(!(day <= 30)) {
            throw new IllegalArgumentException("Invalid Date!"); // meaning the month has 31 days
        }
      } else {
      	if(month == 2) {
      		if(!(((year % 400 == 0) || (year % 100 != 0)) && (year % 4 == 0))) { // if year is not a leap year
      			if(day == 29) {
      				throw new IllegalArgumentException("Year is not a leap year. Invalid Date!"); // if not leap year then 29 Invalid
      			}
      		} else {
      			if(day >= 30) {
      				throw new IllegalArgumentException("Invalid Date!");// leap year but if the day exceeds 29, invalid
      			}
      		}
      	}
      }
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public String toString() {
		return String.format("%02d/%02d/%02d", year, month, day);
	}

}
