package main;

import java.util.ArrayList;
import java.util.Scanner;

public class TerminDelete implements IBearbeitung {
	private ArrayList<Reminder> liste;
	
	public TerminDelete(ArrayList<Reminder> liste) {
		this.liste=liste;
	};


	@Override
	public void bearbeite() {
		
		if (liste.isEmpty()) {
		    System.out.println("📭 Keine Termine zum Löschen vorhanden.");
		    return;
		}
		
		System.out.println("\n📅 Termine:");
		for (int i = 0; i < liste.size(); i++) {
		    System.out.println(i + " - " + liste.get(i).getTitel() + " (" + liste.get(i).getDatum() + ")");
		}
		System.out.print("Geben Sie die Nummer des Termins ein, den Sie löschen möchten: ");
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		if (index < 0 || index >= liste.size()) {
		    System.out.println("❌ Ungültige Nummer.");
		    return;
		}
		Reminder geloescht = liste.remove(index);
		System.out.println("🗑️ Termin \"" + geloescht.getTitel() + "\" wurde gelöscht.");



	}

}
