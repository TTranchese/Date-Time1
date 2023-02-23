import java.time.LocalDate;
import java.time.Year;


public class Main {
	public static void main(String[] args) {
		//dichiaro e assegno la variabile localDate
		LocalDate localDate =  LocalDate.now();
		//dichiaro e assegno la varibile monthDays per sapere da quanti giorni è composto il mese di localDate
		int monthDays =  localDate.lengthOfMonth();
		//stampo i giorni mancanti sottraendo il numero dei giorni passati prendendolo da .getDayOfTheMonth in localDale
		System.out.println("there are "+(monthDays-localDate.getDayOfMonth()));
		//utilizzo il metodo statico .of della classe Year per farmi tornare un oggetto di tipo year per poi prenderne la lunghezza, sottraggo poi il .getDayOfYear da localDate
		System.out.println("there are "+(Year.of(localDate.getYear()).length() - localDate.getDayOfYear()));
	}
}