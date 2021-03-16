package data_practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class day {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2023,2,14);
		System.out.println("D-Day : " + ChronoUnit.DAYS.between(currentDate, targetDate));
	}
}
