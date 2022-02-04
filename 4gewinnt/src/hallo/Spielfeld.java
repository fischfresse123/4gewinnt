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
																					// Buttons und Mausklicke h�ren kann
	// Sieben neue Buttons werden erstellt, mit denen man eigentlich die einzelnen
	// Reihen anw�hlen sollte, in die dann ein neuer Spielstein geworfen wird
	JButton eins = new JButton("1");
	JButton zwei = new JButton("2");
	JButton drei = new JButton("3");
	JButton vier = new JButton("4");
	JButton f�nf = new JButton("5");
	JButton sechs = new JButton("6");
	JButton sieben = new JButton("7");

	public static haupt instance;

	public Spielfeld() {
		eins.addActionListener(this);
		zwei.setBounds(5, 5, 300, 500);

		// Die Buttons werden dem JPanel Spielfeld hinzugef�gt
		add(eins);
		add(zwei);
		add(drei);
		add(vier);
		add(f�nf);
		add(sechs);
		add(sieben);

		setBackground(Color.WHITE); // Das JPanel erh�lt die Hintergrundfarbe wei�
		requestFocus();
		addMouseListener(this); // der MouseListener wird dem JPanel hinzugef�gt
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

		// f�r eigene Zeichnungen

		Graphics2D g2d = (Graphics2D) g;

		// Felder Zeichnen

		for (Feld field : Controller.instance.getFields()) { // Geht on der Schleife alle komponenten der Arraylist
																// durch

			field.draw(g2d); // Zeichnung eines Feldes welches �ber die Arraylist aufgerufen wird und an den
								// in haupt beschriebenen Koordinaten

		}

	}

	private void checkField(int x, int y) { // Methode zur Abfrage mit welchem Feld interagiert wird und �berpr�fung ob
											// dieses leer ist.

		Rectangle cursorHitbox = new Rectangle(x, y, 1, 1); // 1 Pixel gro�es Rechteck, dass eine Hitbox f�r den Cursor
															// erzeugt

		for (Feld Feld : Controller.instance.getFields()) {

			if (cursorHitbox.intersects(Feld)) { // Abfrage �berwelchen Feld die Hitbox des Cursor w�hrend des Klickes
													// ist

				if (Feld.getValue() == FeldValue.EMPTY) { // Abfrage ob dieses Feld leer ist

					Feld.setValue(Controller.instance.getAktuellerSpieler()); // Auswahl des auszuw�hlenden Symbols
																				// (rot, gelb) �ber die Methode
																				// getAktuellerSpieler

					repaint(); // Symbol wird in das Feld gezeichnet

					Controller.instance.n�chsterSpieler(); // Ausf�hren der Methode n�chsterSpieler

				}

				break; // Schleife wird gebrochen

			}

		}

	}

	private void checkWin() { // TODO

	}

	@Override

	public void mouseClicked(MouseEvent e) { // Definition was passiert wenn man auf die Maus klickt

		checkField(e.getX(), e.getY()); // Ausf�hrung der Methode checkField

		checkWin(); // Ausf�hrung der Methode checkWin(TODO)

	}

	// Musste eingef�gt werden, damit alles funktioniert, aber haben keine weitere
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