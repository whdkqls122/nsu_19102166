package challenge_08_programming;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day6Number {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println(ldt.format(fm1));
		System.out.println("오늘은 " + ldt.getMonthValue() + "월의 " + ldt.getDayOfMonth() + "번째 날");
		System.out.println("오늘은 " + ldt.getYear() + "년의 " + ldt.getDayOfYear() + "번째 날");
	}
}
