package main;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;


public class Speicherung {
	
	private static final String DATEINAME= "termine.csv";
	
	public static void speichern(ArrayList<Reminder> liste) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATEINAME))) {

		  
		    writer.write("Titel;Beschreibung;Datum;Uhrzeit");
		    writer.newLine();

		    for (Reminder r : liste) {
		        String zeile = r.getTitel() + ";" 
		                     + r.getBeschreibung() + ";" 
		                     + r.getDatum() + ";" 
		                     + r.getUhrzeit();
		        writer.write(zeile);
		        writer.newLine();
		    }
		    System.out.println("✅ CSV-Datei wurde gespeichert.");
		} catch (IOException e) {
		    System.out.println("❌ Fehler beim Speichern: " + e.getMessage());
		}
	}
	
	
	
	public static void laden(ArrayList<Reminder> liste) {
		java.io.File file = new java.io.File(DATEINAME);
	    if (!file.exists()) {
	        System.out.println("ℹ️ Keine gespeicherte Datei gefunden – starte mit leerer Liste.");
	        return; // Methode beenden, kein Fehler
	    }
		try(BufferedReader reader = new BufferedReader(new FileReader(DATEINAME))){
			String zeile;
			boolean ersteZeile = true; // falls du Header hast

			while ((zeile = reader.readLine()) != null) {
			    // optional Header überspringen
			    if (ersteZeile) {
			        ersteZeile = false;
			        continue;
			    }

			    // Reminder-Daten aus Zeile holen
			    String[] teile = zeile.split(";");

			    if (teile.length == 4) {
			        String titel = teile[0];
			        String beschreibung = teile[1];
			        LocalDate datum = LocalDate.parse(teile[2]);
			        LocalTime uhrzeit = LocalTime.parse(teile[3]);

			        Reminder reminder = new Reminder(titel, beschreibung, datum, uhrzeit);
			        liste.add(reminder);
			    }
			}

			
		}catch(IOException e) {
			System.out.println("Datei könnte nicht gelesen werden."+ e.getMessage());
		}
		
	}

}
