package main;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reminder {
    private String titel;
	private String beschreibung;
    private LocalDate datum;
    private LocalTime uhrzeit;
    private String status;
    
    
    public Reminder(String titel, String beschreibung, LocalDate datum, LocalTime uhrzeit) {
		this.titel = titel;
		this.beschreibung = beschreibung;
		this.datum = datum;
		this.uhrzeit = uhrzeit;
	}
    
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public LocalTime getUhrzeit() {
		return uhrzeit;
	}
	public void setUhrzeit(LocalTime uhrzeit) {
		this.uhrzeit = uhrzeit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
	    return "Titel: " + titel +
	           "\nBeschreibung: " + beschreibung +
	           "\nDatum: " + datum +
	           "\nUhrzeit: " + uhrzeit;
	}

}
