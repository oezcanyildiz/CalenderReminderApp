# 🕒 Java Reminder App (Konsole)

Eine einfache, aber gut strukturierte **Java-Konsolenanwendung**, mit der Termine (Reminders) erstellt, angezeigt, gelöscht und dauerhaft in einer CSV-Datei gespeichert werden können.  
Ideal für Einsteiger, die Java lernen und gleichzeitig sauberen, objektorientierten Code schreiben möchten.

---

## 📌 Inhaltsverzeichnis
- [Features](#-features)
- [Technologien](#-technologien)
- [Projektstruktur](#-projektstruktur)
- [Installation & Ausführung](#-installation--ausführung)
- [Anwendung](#-anwendung)
- [Beispiel](#-beispiel)
- [Verbesserungsvorschläge](#-verbesserungsvorschläge)
- [Lizenz](#-lizenz)

---

## ✨ Features
- ✅ Termine hinzufügen (Titel, Beschreibung, Datum, Uhrzeit)  
- 📅 Alle Termine anzeigen  
- 🗑️ Termine löschen (per Index-Auswahl)  
- 💾 Speicherung aller Daten in `termine.csv` (bleiben nach Neustart erhalten)  
- 🧭 Übersichtliches Konsolenmenü  
- 🧱 Saubere Struktur mit Interface und getrennten Klassen

---

## 🧰 Technologien
- **Java** 17+  
- `ArrayList` für dynamische Datenspeicherung  
- `LocalDate` & `LocalTime` (Java Time API) für Datums- und Uhrzeitverarbeitung  
- `FileReader` & `FileWriter` für CSV Persistenz  
- Konsolenanwendung (keine zusätzlichen Libraries notwendig)

---

## 🗂️ Projektstruktur

src/
├── main/
│ ├── Main.java // Einstiegspunkt, Menüsteuerung
│ ├── Reminder.java // Datenmodell
│ ├── IBearbeitung.java // Interface für Termin-Operationen
│ ├── TerminAdd.java // Logik für Termin hinzufügen
│ ├── TerminListing.java // Logik für Termin anzeigen
│ ├── TerminDelete.java // Logik für Termin löschen
│ ├── Speicherung.java // CSV-Lese- und Schreiblogik
│
└── termine.csv // CSV-Datei mit gespeicherten Terminen

---

## ⚡ Installation & Ausführung

1. **Projekt klonen oder herunterladen**

```bash
git clone https://github.com/<oezcanyildiz>/java-reminder-app.git
cd java-reminder-app

Kompilieren
javac -d bin src/main/*.java

Starten
java -cp bin main.Main


🧭 Anwendung

Nach dem Start erscheint das Menü:
--------------------------------------------------
Herzlich willkommen zur Reminder-APP
1 - Termin hinzufügen
2 - Alle Termine anzeigen
3 - Termin löschen
4 - Programm beenden
--------------------------------------------------

Termin hinzufügen

Titel eingeben

Beschreibung eingeben

Datum im Format yyyy-MM-dd (z. B. 2025-10-22)

Uhrzeit im Format HH:mm (z. B. 14:30)

2️⃣ Alle Termine anzeigen

Listet alle gespeicherten Termine übersichtlich mit Titel, Beschreibung, Datum und Uhrzeit.

3️⃣ Termin löschen

Zeigt alle Termine mit Indexnummer

Eingabe der Nummer → Termin wird gelöscht

4️⃣ Programm beenden

Speichert automatisch alle Änderungen in termine.csv.

📄 Beispiel (CSV-Datei)
Titel;Beschreibung;Datum;Uhrzeit
Zahnarzt;Kontrolle;2025-10-22;08:30
Meeting;Projektbesprechung;2025-10-23;14:00


🚀 Verbesserungsvorschläge 🧠💻🧪

🧠 Eingabevalidierung

Datum- und Uhrzeitprüfung mit try-catch, damit das Programm nicht abstürzt, wenn falsche Werte eingegeben werden.
(z. B. „2025-13-99“ oder „08:75“)

🧼 Zentraler Scanner

Statt in jeder Klasse einen neuen Scanner zu öffnen, einen Scanner in Main erstellen und an alle Klassen weitergeben.
➝ Stabiler, weniger Fehler, bessere Speicherverwaltung.

🧭 Service-Schicht

Business-Logik (Hinzufügen, Löschen, Validieren) aus UI-Klassen herauslösen

In eine eigene ReminderService-Klasse verschieben.
➝ Bessere Testbarkeit, leichtere Erweiterung (GUI, REST API, Tests).

📊 Sortierung & Suche

Termine nach Datum/Uhrzeit sortieren.

Suchfunktion nach Titel oder Datum einbauen.

🪄 Zusätzliche Felder

z. B. Status: offen, erledigt, verschoben.

Automatische Markierung abgelaufener Termine.

💻 GUI oder Web-Interface

Swing / JavaFX für Desktop-UI

Spring Boot REST API als Webservice.

🛢️ Datenbank statt CSV

Persistenz mit MySQL oder SQLite für größere Datenmengen und mehrere Benutzer.

Sauberere Abfragen, bessere Datenintegrität.

🧪 Tests

Unit-Tests für Speicher- und Serviceklassen.

Fehler werden früh erkannt, Code wird stabiler.

📜 Lizenz

Dieses Projekt ist frei verwendbar und kann beliebig erweitert oder verändert werden.


👨‍💻 Autor
Özcan
Fachinformatiker für Anwendungsentwicklung (in Ausbildung)
----->  https://github.com/oezcanyildiz







