package Data_Structure.section1;

public class DeadlineEvent extends Event{
	MyDate deadline;
	
	public DeadlineEvent(String title, MyDate d) {
		super(title);
		deadline = d;
	}
	public String toString() {
		return title + ", " + deadline.toString();
	}
}
