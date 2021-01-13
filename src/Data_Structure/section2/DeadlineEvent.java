package Data_Structure.section2;

public class DeadlineEvent extends Event{
	MyDate deadline;
	
	public DeadlineEvent(String title, MyDate date) {
		super(title);
		deadline = date;
	}
	public String toString() {
		return title + ", " + deadline.toString();
	}
	@Override
	public boolean isRelavnt(MyDate date) {
		return deadline.compareTo(date) >= 0; 
	}
}
