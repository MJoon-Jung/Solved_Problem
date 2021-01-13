package Data_Structure.section2;

public abstract class Event {
	public String title;
	public Event(String title) {
		this.title = title;
	}
	public abstract boolean isRelavnt(MyDate date);
}
