package toString;

/**
 * 
 */
class Date {
    int day, month, year;
    String dow;

    Date() {
        this.day = 31;
        this.month = 03;
        this.year = 2004;
        this.dow = "Wendesday";
    }

    Date(int day, int month, int year, String dow) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dow = dow;
    }

    void setDay(int d) {
        this.day = d;
    }

    void setMonth(int m) {
        this.month = m;
    }

    void setYear(int y) {
        this.year = y;
    }

    void setDow(String str) {
        this.dow = str;
    }

    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    @Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + ", dow=" + dow + "]";
	}

}// date class ends here

class Test {
    public static void main(String[] args) {
        
    	
    	Date d1 = new Date();
    	
    	System.out.println(d1.toString());


    }// main ends here
}// Test class ends here