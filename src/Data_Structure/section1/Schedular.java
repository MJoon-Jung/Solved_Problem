package Data_Structure.section1;

import java.util.Scanner;

public class Schedular {
	Event [] events = new Event [100];
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
				
			}
			else if(command.equals("show")) {
				
			}
			else if(command.equals("exit")) {
				break;
			}
				
		}
	}
	private void hanndleAddDeadlineEvent() {
		System.out.print("\tuntil : ");
		String dateString = sc.next();
		System.out.print("\ttitle : ");
		String title = sc.next();
		
		DeadlineEvent dl = new DeadlineEvent(title,ParseDateString(dateString));
		
	}
	private void hanndleAddDurationEvent() {
		System.out.print("\tbegin : ");
		String dateBegin = sc.next();
		System.out.print("\tend : ");
		String dateEnd = sc.next();
		System.out.print("\ttitle : ");
		String title = sc.next();
		
		DurationEvent de = new DurationEvent(title,ParseDateString(dateBegin),ParseDateString(dateEnd));
		
	}
	private void hanndleAddOneDayEvent() {
		System.out.print("\twhen : ");
		String dateString = sc.next();
		System.out.print("\ttitle : ");
		String title = sc.next();
		
		OneDayEvent ev = new OneDayEvent(title,ParseDateString(dateString));
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
