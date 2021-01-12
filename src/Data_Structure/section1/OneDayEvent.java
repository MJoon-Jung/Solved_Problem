package Data_Structure.section1;

public class OneDayEvent extends Event{
	public MyDate date;
	
	public OneDayEvent(String title, MyDate d) {
		super(title);
		date = d;
	}
	public String toString() {
		return title + ", " + date.toString();
	}
}
