package Data_Structure.section2;

public class OneDayEvent extends Event{
	public MyDate date;
	
	public OneDayEvent(String title, MyDate d) {
		super(title);
		date = d;
	}
	public String toString() {
		return title + ", " + date.toString();
	}
	@Override
	public boolean isRelavnt(MyDate date) {
		return this.date.compareTo(date) == 0;
	}
	
}
