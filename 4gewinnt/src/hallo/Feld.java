package hallo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Feld extends Rectangle { // Jedes Feld ist ein Rechteck

	private FeldValue value;

	public Feld(int x, int y, int width, int height) {

		super(x, y, width, height);

		value = FeldValue.EMPTY; // Feld ist am Anfang leer.

	}

	// Rahmen

	public void draw(Graphics2D g2d) { // Zugriff auf Grafikklasse für das Zeichnen

		g2d.setColor(Color.BLACK); // Schwarze Farbe für die Rahmen

		g2d.drawRect(x, y, width, height); // Rechteck wird mit Koordinaten die woanders bestimmt werden gezeichnet

		// Symbol Zeichnung roter Kreis

		if (value == FeldValue.O) { // wenn rot ein bestimmtest Feld auswählt

			g2d.setPaint(new Color(255, 0, 0)); // Farbauswahl rot

			g2d.fillOval(x + 5, y + 5, width - 10, height - 10); // Maße für das gefüllte Oval, damit es kleiner als ein
																	// Fel ist

		} else if (value == FeldValue.X) { // wenn gleb ein bestimmtest Feld auswählt

			g2d.setPaint(new Color(255, 255, 0)); // Farbauswahl Gelb

			g2d.fillOval(x + 5, y + 5, width - 10, height - 10); // Maße für das gefüllte Oval, damit es kleiner als ein
																	// Fel ist

		}

	}

	public FeldValue getValue() { // Abfrage über das Enum zu dem Inhalt eines Feldes (X,o,EMPTY)

		return value; // Gibt Wert aus

	}

	public void setValue(FeldValue value) { // Methode nimmt den Wert Value an

		this.value = value;

	}

}