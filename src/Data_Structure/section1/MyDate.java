package Data_Structure.section1;

public class MyDate {
	int year;
	int month;
	int day;
	
	MyDate(int y,int m, int d){
		year = y;
		month = m;
		day = d;
	}
	public String toString() {
		return year+"/"+month+"/"+day;
	}
}
