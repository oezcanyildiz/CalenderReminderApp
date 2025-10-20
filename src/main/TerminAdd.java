package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;


public class TerminAdd implements IBearbeitung {
	
	private ArrayList<Reminder> liste;
	
	public TerminAdd(ArrayList<Reminder> liste) {
		this.liste=liste;
	}
	
	
	
	@Override
	public void bearbeite() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Titel: ");
		String titel=input.nextLine();
		
		System.out.print("Beschreibung: ");
		String beschreibung=input.nextLine();
		
	    System.out.print("Datum (yyyy-MM-dd): ");
	    String datumString = input.nextLine();
	    LocalDate datum = LocalDate.parse(datumString);
		
        System.out.print("Uhrzeit (HH:mm): ");
        String uhrzeitString = input.nextLine();
        LocalTime uhrzeit = LocalTime.parse(uhrzeitString);
		
        Reminder reminder = new Reminder(titel, beschreibung, datum, uhrzeit);
        liste.add(reminder);
		
		System.out.println("✅ Termin erfolgreich hinzugefügt!");
		
	}

}
