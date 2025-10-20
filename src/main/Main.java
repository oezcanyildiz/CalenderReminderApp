package main;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Reminder> terminen=new ArrayList<>(); 
		Speicherung.laden(terminen);
		
		boolean endloss=true;
		Scanner input=new Scanner(System.in);
		
		while(endloss) {
			System.out.println("Herzlisch wilkommen zu Reminder-APP");
			System.out.println("Drucken Sie Termin einzufüen um         1 ");
			System.out.println("Drucken Sie ALLE Termin anzuzeigen um   2 ");
			System.out.println("Drucken Sie Termin löschen um           3 ");
			System.out.println("Drucken Sie App zu schliessen um        4 ");
			System.out.print("Ihre Angabe: ");
			int eingabe=input.nextInt();
			input.nextLine();
			
			switch(eingabe){
				case 1:
					IBearbeitung add=new TerminAdd(terminen);
					add.bearbeite();
					Speicherung.speichern(terminen);
					break;
				case 2:
					IBearbeitung listen=new TerminListing(terminen);
					listen.bearbeite();
					break;
				case 3:
				    IBearbeitung delete = new TerminDelete(terminen);
				    delete.bearbeite();
				    Speicherung.speichern(terminen);
					break;
				case 4:
		        	Speicherung.speichern(terminen);
		            endloss = false;
		            System.out.println("Programm wird beendet.");
		            break;
		        default:
		            System.out.println("Ungültige Eingabe.");	
			}
		}
		input.close();
	}
}
