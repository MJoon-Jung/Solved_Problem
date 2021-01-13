package Data_Structure.section2;

public class DurationEvent extends Event{
	MyDate begin;
	MyDate end;
	
	public DurationEvent(String title, MyDate b, MyDate e) {
		super(title);
		begin = b;
		end = e;
	}
	public String toString() {
		return title + ", " + begin.toString() + " ~ " + end.toString();
	}
	@Override
	public boolean isRelavnt(MyDate date) {
		return begin.compareTo(date) <= 0 && end.compareTo(date) >= 0;
	}
}
