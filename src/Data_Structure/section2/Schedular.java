package Data_Structure.section2;

import java.util.Scanner;

public class Schedular {
	Event [] events = new Event [100];
	public int n = 0;
	public int capacity = events.length;
	private Scanner sc;
	public void processCommand() {
		sc = new Scanner(System.in);
		while(true) {
			System.out.println("$  ");
			String command = sc.next();
			if(command.equalsIgnoreCase("addEvent")) {
				String type = sc.next();
				if(type.equalsIgnoreCase("oneday")) {
					hanndleAddOneDayEvent();
				}
				else if(type.equalsIgnoreCase("duration")) {
					hanndleAddDurationEvent();
				}
				else if(type.equalsIgnoreCase("deadline")) {
					hanndleAddDeadlineEvent();
				}
			}
			else if(command.equals("list")) {
				handleList();
			}
			else if(command.equals("show")) {
				handleShow();
			}
			else if(command.equals("exit")) {
				break;
			}
				
		}
		sc.close();
	}
	private void handleShow() {
		System.out.print("\tdate : ");
		String dataString = sc.next();
		MyDate thedate= ParseDateString(dataString);
		for(int i = 0; i < n; i++) {
			if(events[i].isRelavnt(thedate)) {
				System.out.println(events[i].toString());
			}
		}
	}
	private void handleList() {
		if(events[0] == null) {
			System.out.println("No Event");
		}
		for(int i = 0; i < n; i++) {
			System.out.println("\t"+events[i].toString());
		}
	}
	private void hanndleAddDeadlineEvent() {
		System.out.print("\tuntil : ");
		String dateString = sc.next();
		System.out.print("\ttitle : ");
		String title = sc.next();
		
		DeadlineEvent dl = new DeadlineEvent(title,ParseDateString(dateString));
		addEvent(dl);
	}
	private void hanndleAddDurationEvent() {
		System.out.print("\tbegin : ");
		String dateBegin = sc.next();
		System.out.print("\tend : ");
		String dateEnd = sc.next();
		System.out.print("\ttitle : ");
		String title = sc.next();
		
		DurationEvent de = new DurationEvent(title,ParseDateString(dateBegin),ParseDateString(dateEnd));
		addEvent(de);
	}
	private void hanndleAddOneDayEvent() {
		System.out.print("\twhen : ");
		String dateString = sc.next();
		System.out.print("\ttitle : ");
		String title = sc.next();
		
		OneDayEvent ev = new OneDayEvent(title,ParseDateString(dateString));
		addEvent(ev);
	}
	public void addEvent(Event e) {
		if(n >= capacity) {
			realLocate();
		}
		events[n++] = e;
	}
	public void realLocate() {
		Event [] tmp = new Event [capacity * 2];
		for(int i = 0; i <= n; i++) {
			tmp[i] = events[i];
		}
		events = tmp;
		capacity *= 2;
	}
	public MyDate ParseDateString(String s) {
		String [] token = s.split("/");
		int year = Integer.parseInt(token[0]);
		int month = Integer.parseInt(token[1]);
		int day = Integer.parseInt(token[2]);
		MyDate date = new MyDate(year,month,day);
		return date;
	}
	public static void main(String[] args) {
		Schedular app = new Schedular();
		app.processCommand();
	}

}
