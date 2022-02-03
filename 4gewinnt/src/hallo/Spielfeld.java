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

public class Spielfeld extends JPanel implements MouseListener, ActionListener {
	JButton reset = new JButton("Reset");
	JButton zwei = new JButton("2");
	JButton drei = new JButton("3");
	JButton vier = new JButton("4");
	JButton fünf = new JButton("5");
	JButton sechs = new JButton("6");
	JButton sieben = new JButton("7");

	public Spielfeld() {
		// setLayoutManager(null);
		reset.addActionListener(this);
		zwei.setBounds(5, 5, 300, 500);
		add(reset);
		add(zwei);
		add(drei);
		add(vier);
		add(fünf);
		add(sechs);
		add(sieben);

		setBackground(Color.WHITE);
		requestFocus();
		addMouseListener(this);
		setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// eigene Zeichnungen
		Graphics2D g2d = (Graphics2D) g;

		// Felder Zeichnen
		for (Feld field : Controller.instance.getFields()) {
			field.draw(g2d);

		}
	}

	private void checkField(int x, int y) {
		Rectangle cursorHitbox = new Rectangle(x, y, 1, 1);
		for (Feld Feld : Controller.instance.getFields()) {
			if (cursorHitbox.intersects(Feld)) {
				if (Feld.getValue() == FeldValue.EMPTY) {
					Feld.setValue(Controller.instance.getAktuellerSpieler());
					repaint();
					Controller.instance.nächsterSpieler();
				}
				break;
			}
		}
	}
	
	
	private void checkWin() {
    }
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		checkField(e.getX(), e.getY());
        checkWin();
	}

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