package hallo;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Spielfeld extends JPanel implements MouseListener, ActionListener { // eine neue Klasse wird erstellt, die
																					// automatisch ein JPanel mit
																					// demselben Namen erstellt und
																					// ActionListener und MouseListener
																					// bedeuten, dass diese Klasse auf
																					// Buttons und Mausklicke hören kann
	// Sieben neue Buttons werden erstellt, mit denen man eigentlich die einzelnen
	// Reihen anwählen sollte, in die dann ein neuer Spielstein geworfen wird
	JButton eins = new JButton("1");
	JButton zwei = new JButton("2");
	JButton drei = new JButton("3");
	JButton vier = new JButton("4");
	JButton fünf = new JButton("5");
	JButton sechs = new JButton("6");
	JButton sieben = new JButton("7");

	public static haupt instance;

	public Spielfeld() {
		eins.addActionListener(this);
		zwei.setBounds(5, 5, 300, 500);

		// Die Buttons werden dem JPanel Spielfeld hinzugefügt
		add(eins);
		add(zwei);
		add(drei);
		add(vier);
		add(fünf);
		add(sechs);
		add(sieben);

		setBackground(Color.WHITE); // Das JPanel erhält die Hintergrundfarbe weiß
		requestFocus();
		addMouseListener(this); // der MouseListener wird dem JPanel hinzugefügt
		setVisible(true); // Das JPanel ist nun zu sehen

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == eins) {
			Spielfeld spielfeld = new Spielfeld(); // Wird ein neues JPanel Spielfeld erstellt
			instance = new haupt();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// für eigene Zeichnungen

		Graphics2D g2d = (Graphics2D) g;

		// Felder Zeichnen

		for (Feld field : Controller.instance.getFields()) { // Geht on der Schleife alle komponenten der Arraylist
																// durch

			field.draw(g2d); // Zeichnung eines Feldes welches über die Arraylist aufgerufen wird und an den
								// in haupt beschriebenen Koordinaten

		}

	}

	private void checkField(int x, int y) { // Methode zur Abfrage mit welchem Feld interagiert wird und überprüfung ob
											// dieses leer ist.

		Rectangle cursorHitbox = new Rectangle(x, y, 1, 1); // 1 Pixel großes Rechteck, dass eine Hitbox für den Cursor
															// erzeugt

		for (Feld Feld : Controller.instance.getFields()) {

			if (cursorHitbox.intersects(Feld)) { // Abfrage überwelchen Feld die Hitbox des Cursor während des Klickes
													// ist

				if (Feld.getValue() == FeldValue.EMPTY) { // Abfrage ob dieses Feld leer ist

					Feld.setValue(Controller.instance.getAktuellerSpieler()); // Auswahl des auszuwählenden Symbols
																				// (rot, gelb) über die Methode
																				// getAktuellerSpieler

					repaint(); // Symbol wird in das Feld gezeichnet

					Controller.instance.nächsterSpieler(); // Ausführen der Methode nächsterSpieler

				}

				break; // Schleife wird gebrochen

			}

		}

	}

	private void checkWin() { // TODO

	}

	@Override

	public void mouseClicked(MouseEvent e) { // Definition was passiert wenn man auf die Maus klickt

		checkField(e.getX(), e.getY()); // Ausführung der Methode checkField

		checkWin(); // Ausführung der Methode checkWin(TODO)

	}

	// Musste eingefügt werden, damit alles funktioniert, aber haben keine weitere
	// Funktion

	@Override

	public void mousePressed(MouseEvent e) {

	}

	@Override

	public void mouseReleased(MouseEvent e) {

	}

	@Override

	public void mouseEntered(MouseEvent e) {

	}

	@Override

	public void mouseExited(MouseEvent e) {

	}

}