package br.com.fabricadeprogramador.aula2;

import java.time.LocalDate;
import java.util.Date;

public class DuvidaDate {

	public static void main(String[] args) {
		
//		// Data de hoje...
//		Date date = new Date();
//		System.out.println(date);
//		
//		LocalDate datahumana = LocalDate.now();
//		System.out.println(datahumana);

		
		Evento ev = new Evento();
		Date data = new Date();
		
		data.setDate(25);
		data.setMonth(11);
		data.setYear(115);
		
		ev.setData(data);
		
		System.out.println(ev.getData());
		
	}

}
