package hallo;

public enum FeldValue { // Enum speichert die Variablen-Werte X, O, EMPTY und macht sie von �berall
						// zugreifbar

	X(1), O(2), EMPTY(0); // Jede M�glichkeit nimmt eine Zahl an

	
	
	// Speicher- and Abfrage-M�glichkeit der Werte
	int value;

	private FeldValue(int Wert) {

		value = Wert;

	}

	int getValue() {

		return value;

	}

}