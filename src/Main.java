import java.time.LocalDate;


public class Main {
	public static void main(String[] args) {
		LocalDate localDate =  LocalDate.now();
		int monthDays =  localDate.lengthOfMonth();
		System.out.println("there are "+(monthDays-localDate.getDayOfMonth())+" days left until the end of "+localDate.getMonth());
		System.out.println("there are "+(localDate.lengthOfYear()-localDate.getDayOfYear())+" days left until the end of "+localDate.getYear());
	}
}