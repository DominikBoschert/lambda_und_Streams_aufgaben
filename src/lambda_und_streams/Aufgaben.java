package lambda_und_streams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import BuLi.Spiel;
import BuLi.Verein;

class Aufgaben {
	private boolean initialized = false;
	private boolean buLiInitialized = false;
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	private ArrayList<Long> multiplyNumbers = new ArrayList<Long>();
	private ArrayList<Spiel> spiele = new ArrayList<Spiel>();
	private HashMap<Integer, Verein> vereine = new HashMap<Integer, Verein>();

	void Init(int anzahlZahlen, int min, int max) {
		for(int i = 0; i < anzahlZahlen; i++) {
			int rnd = (int) (Math.random() * (max + 1 - min));
			numbers.add(rnd);
			if(i < 10) {
				multiplyNumbers.add((long) rnd + 1);
			}
		}
		initialized = true;
	}

	void InitBuLi() {
		Scanner s = new Scanner(Aufgaben.class.getResourceAsStream("/BuLi/bundesliga_Verein.csv"), "ISO-8859-1");
		String[] line;
		s.nextLine();
		while(s.hasNextLine()) {
			line = s.nextLine().split(";");
			vereine.put(Integer.parseInt(line[0]), new Verein(Integer.parseInt(line[0]), line[1]));
		}

		s.close();

		s = new Scanner(Aufgaben.class.getResourceAsStream("/BuLi/bundesliga_Spiel.csv"), "ISO-8859-1");
		s.nextLine();
		while(s.hasNextLine()) {
			line = s.nextLine().split(";");
			spiele.add(new Spiel(Integer.parseInt(line[0]), Integer.parseInt(line[1]),
					vereine.get(Integer.parseInt(line[4])).getName(),
					vereine.get(Integer.parseInt(line[5])).getName(),
					Integer.parseInt(line[6]), Integer.parseInt(line[7]), line[2], line[3]));
		}
		s.close();
		buLiInitialized = true;
	}

	void Aufgabe_1() {
		/*
		 *Aufgabe 1 
		 * 
		 * Geben Sie alle Einträge der Arraylist numbers mit Hilfe einer Lambda expression aus.
		 * 
		 */
		
		System.out.println("Aufgabe 1:");
		// ToDo Aufgabe 1

		//Output Padding
		System.out.println();
	}

	void Aufgabe_2() {
		/*
		 *Aufgabe 2 
		 * 2.1:
		 * Geben Sie alle gerade Zahlen der Arraylist numbers mit Hilfe 
		 * einer Lambda expression ineiner Zeile aus.
		 * 
		 * 2.2:
		 * Geben Sie alle ungerade Zahlen der Arraylist numbers mit Hilfe
		 * einer Lambda expression in einer Zeile aus.
		 * 
		 */

		System.out.println("Aufgabe 2.1:");
		// ToDo Aufgabe 2.1			

		//Output Padding
		System.out.println();
		System.out.println();

		System.out.println("Aufgabe 2.2:");
		// ToDo Aufgabe 2.2

		//Output Padding
		System.out.println();
		System.out.println();
	}

	void Aufgabe_3() {
		/*
		 *Aufgabe 3 
		 * 
		 * 3.1
		 * Berechnen Sie die Summe aller Zahlen der Arraylist numbers und
		 * geben Sie das Ergebnis aus. Sie sollten dabei einen Stream nutzen.
		 * 
		 * 3.2
		 * Verdoppeln Sie mit Hilfe eines Streams alle Zahlen der Arraylist
		 * numbers und geben Sie die Ergebnise in einer Zeile aus.
		 * 
		 * 3.3
		 * Geben Sie zuerst alle Zahlen der Arraylist multiplyNumbers in
		 * einer Zeile aus. Danach multiplizieren Sie alle Zahlen und geben
		 * das Ergebnis in derselben Zeile aus. Nutzen hierfür nur einen Stream!
		 * 
		 */

		System.out.println("Aufgabe 3.1:");
		// ToDo Aufgabe 3.1

		//Output Padding
		System.out.println();

		System.out.println("Aufgabe 3.2:");
		// ToDO Aufgabe 3.2

		//Output padding
		System.out.println();
		System.out.println();

		System.out.println("Aufgabe 3.3:");
		// ToDo Aufgabe 3.3

		//Output Padding
		System.out.println();
	}

	void Aufgabe_4() {
		/*
		 *Aufgabe 4
		 * 
		 * 4.1
		 * Geben Sie die Gesamtanzahl aller geschossenen Tore aus.
		 * 
		 * 4.2
		 *  Geben Sie eine Liste aller Spiele eines Vereines aus.
		 *  Die Liste sollte nach Spieltag sortiert sein und folgende
		 *  Daten enthalten: Datum, Spieltag, Heim Mannschaft, Gast
		 *  Mannschaft, Tore der Heim Mannschaft, Tore der Gast Mannschaft.
		 * 
		 * 4.3
		 * Geben Sie die Anzahl der geschossenen Tore und der Gegentore
		 * eines Vereins aus
		 * 
		 * 4.4
		 * Geben Sie die Tordifferenz eines Vereines aus.
		 * 
		 */

		String mannschaft = "RB Leipzig";

		System.out.println("Aufgabe 4.1:");
		// ToDo Aufgabe 4.1

		//Output Padding
		System.out.println();

		System.out.println("Aufgabe 4.2");
		// ToDo Aufgabe 4.2

		//Output Padding
		System.out.println();

		System.out.println("Aufgabe 4.3:");
		// ToDo Aufgabe 4.3

		//Output Padding
		System.out.println();

		System.out.println("Aufgabe 4.4:");
		// ToDo Aufgabe 4.4

		//Output Padding
		System.out.println();
	}

	public boolean isInitialized() {
		return initialized;
	}

	public boolean isBuLiInitialized() {
		return buLiInitialized;
	}


}
