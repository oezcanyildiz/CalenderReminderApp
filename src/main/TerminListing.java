package main;

import java.util.ArrayList;

public class TerminListing implements IBearbeitung {
	
	private ArrayList<Reminder> liste;
	
	public TerminListing(ArrayList<Reminder> liste) {
		this.liste=liste;
	};


	@Override
	public void bearbeite() {
		 if (liste.isEmpty()) {
	            System.out.println("📭 Keine Termine vorhanden.");
	            return;
	        }

	        System.out.println("\n📅 Alle Termine:");
	        for (Reminder r : liste) {
	            System.out.println(r);
	            System.out.println("-------------------------");
	        }
	    }
}


